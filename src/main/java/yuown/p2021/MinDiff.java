package yuown.p2021;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MinDiff {
	public static void main(String[] args) {
		List<Integer> skills = new ArrayList() {{
			add(690726610);
			add(893005429);
			add(771998092);
			add(23203911);
			add(732048773);
			add(609897342);
			add(605163057);
			add(492930001);
			add(830083522);
			add(952945114);
		}};
		System.out.println(maxPairs(skills, 763949691));
	}
	
	public static int maxPairs(List<Integer> skillLevel, int minDiff) {
	    // Write your code here
	        int count = 0;
	        skillLevel = skillLevel.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
	        System.out.println("Skills " + skillLevel);
	        System.out.println("Diff " + minDiff);
	        
	        for (int i = 0; i < skillLevel.size(); i++) {
	            for (int j = i + 1; j < skillLevel.size(); j++) {
	                int diff = Math.abs(skillLevel.get(j) - skillLevel.get(i));
	                if(diff > minDiff) {
	                    count++;
	                }
	            }
	        }
	        return count;
	    }

}
