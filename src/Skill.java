
import java.util.Collections;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author INT497
 */
public class Skill {
    private String skillName;
    private int skillId;
    private int maxLevel; //Max Level of Skill
    private int currentLevel = 0; //Current Level of Skill
    
//    Set as Map<Level, Point>
//    -------------------------------------------
//    Example 
//    Level 1 use 2 point 
//    Level 2 use 4 point
//    Map<Integer, Integer> ppl = new TreeMap<Integer, Integer>();
//    ppl.put(1,2);
//    ppl.put(2,4);
    private Map<Integer, Integer> pointPerLevel; 
    
//  Set as Map<Level, List of Skill as Map<Skill, Level required>>
//  --------------------------------------------------------------------
//  Example   
//  Level 1 required Skill SlashI level 5
//  Level 2 required Skill SlashI level 5 and Armor level 5
//  Map<Integer, Map<Skill, Integer>> nextSkill = new TreeMap<Integer, Map<Skill, Integer>>(); 
//  Skill slash = new Skill(Slash,1);
//  Skill armor = new Skill(Armor,2);
//    
//  Map<Skill, Integer> required = new TreeMap<Skill, Integer>();
//  required.put(slash, 5);
//  nextSkill.put(1, required);
//    
//  required = new TreeMap<Skill, Integer>();
//  required.put(slash, 5);
//  required.put(armor, 5);
//  nextSkill.put(2, required);
    private Map<Integer, Map<Skill, Integer>> nextSkill;
//  Set as Map<Level, List of Skill as Map<Skill, Level required>>
//  Use like nextskill.
    private Map<Integer, Map<Skill, Integer>> previousSkill;

    public Skill(String skillName, int skillId, int maxLevel, Map<Integer, Integer> pointPerLevel, Map<Integer, Map<Skill, Integer>> nextSkill, Map<Integer, Map<Skill, Integer>> previousSkill) {
        this.skillName = skillName;
        this.skillId = skillId;
        this.maxLevel = maxLevel;
        this.pointPerLevel = pointPerLevel;
        this.nextSkill = nextSkill;
        this.previousSkill = previousSkill;
    }

    public Skill(String skillName, int skillId, int maxLevel, Map<Integer, Integer> pointPerLevel) {
        this(skillName, skillId, maxLevel, pointPerLevel, Collections.EMPTY_MAP, Collections.EMPTY_MAP);
    }

    public Skill(String skillName, int skillId, int maxLevel) {
        this(skillName, skillId, maxLevel, Collections.EMPTY_MAP);
    }

    public Skill(String skillName, int skillId) {
        this(skillName, skillId, 1);
    }

    public int getMaxLevel() {
        return maxLevel;
    }

    public void setMaxLevel(int maxLevel) {
        this.maxLevel = maxLevel;
    }

    public int getCurrentLevel() {
        return currentLevel;
    }

    public void setCurrentLevel(int currentLevel) {
        this.currentLevel = currentLevel;
    }

    public Map<Integer, Integer> getPointPerLevel() {
        return pointPerLevel;
    }

    public void setPointPerLevel(Map<Integer, Integer> pointPerLevel) {
        this.pointPerLevel = pointPerLevel;
    }

    public Map<Integer, Map<Skill, Integer>> getNextSkill() {
        return nextSkill;
    }

    public void setNextSkill(Map<Integer, Map<Skill, Integer>> nextSkill) {
        this.nextSkill = nextSkill;
    }

    public Map<Integer, Map<Skill, Integer>> getPreviousSkill() {
        return previousSkill;
    }

    public void setPreviousSkill(Map<Integer, Map<Skill, Integer>> previousSkill) {
        this.previousSkill = previousSkill;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public int getSkillId() {
        return skillId;
    }

    public void setSkillId(int skillId) {
        this.skillId = skillId;
    }
    
}
