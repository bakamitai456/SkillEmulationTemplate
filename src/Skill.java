
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
    private Map<Integer, Map<Skill, Integer>> nextSkill;
    private Map<Integer, Map<Skill, Integer>> previousSkill;

    
    Skill(int maxLevel, Map<Integer, Integer> pointPerLevel, Map<Integer, Map<Skill, Integer>> nextSkill, Map<Integer, Map<Skill, Integer>> previousSkill) {
        this.maxLevel = maxLevel;
        this.pointPerLevel = pointPerLevel;
        this.nextSkill = nextSkill;
        this.previousSkill = previousSkill;
    }

    Skill(int maxLevel, Map<Integer, Integer> pointPerLevel) {
        this(maxLevel, pointPerLevel, Collections.EMPTY_MAP, Collections.EMPTY_MAP);
    }
    
    Skill(int maxLevel){
        this(maxLevel, Collections.EMPTY_MAP);
    }
    
    Skill(){
        this(1);
    }
    
}
