package Collections;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FootBallTeamDesign {
	
	enum Type {
		 DEFENDER,
		 STRIKER,
		 NONE,
		 BOTH
		}
		 
		static class Player {
		 public String name;
		 public double height;
		 public double bmi;
		 public int scores;
		 public int defends;
		 public Type type;
		 
		 public Player(List < String > list) {
		  super();
		 
		  this.name = list.get(0);
		  this.height = Double.parseDouble(list.get(1));
		  this.bmi = Double.parseDouble(list.get(2));
		  this.scores = Integer.parseInt(list.get(3));
		  this.defends = Integer.parseInt(list.get(4));
		  this.type = this.getType();
		 }
		 
		 private Type getType() {
		  int maxBmi = 23, minGoalsScored = 50, minGoalsDefended = 30;
		  double minHeight = 5.8;
		  if (this.height < minHeight && this.bmi > maxBmi)
		   return Type.NONE;
		  if (this.scores >= minGoalsScored && this.defends >= minGoalsDefended)
		   return Type.BOTH;
		  if (this.scores >= minGoalsScored)
		   return Type.STRIKER;
		  if (this.defends >= minGoalsDefended)
		   return Type.DEFENDER;
		  return Type.NONE;
		 }
		}
		 public static List<List<String>> getSelectionStatus(List<List<String>> applications) {
		List < Player > players = applications.stream()
				  .map(s -> new Player(s))
				  .collect(Collectors.toList());
				 Collections.sort(players, (o1, o2) -> o1.name.compareTo(o2.name));
				 
				 List < Player > defenders = players.stream().
				 filter(p -> p.type == Type.DEFENDER).
				 collect(Collectors.toList());
				 
				 List < Player > strikers = players.stream().
				 filter(p -> p.type == Type.STRIKER).
				 collect(Collectors.toList());
				 
				 List < Player > both = players.stream().
				 filter(p -> p.type == Type.BOTH).
				 collect(Collectors.toList());
				 
				 while (defenders.size() < strikers.size() && both.size() > 0) {
				  defenders.add(both.remove(0));
				 }
				 
				 while (strikers.size() < defenders.size() && both.size() > 0) {
				  strikers.add(both.remove(0));
				 }
				 
				 Collections.sort(defenders, (o1, o2) -> o1.defends - o2.defends);
				 Collections.reverse(defenders);
				 Collections.sort(strikers, (o1, o2) -> o1.scores - o2.scores);
				 Collections.reverse(strikers);
				 
				 int min = Math.min(defenders.size(), strikers.size());
				 Set < String > defenderName = defenders.subList(0, min).stream().map(x -> x.name).collect(Collectors.toSet());
				 Set < String > strikerName = strikers.subList(0, min).stream().map(x -> x.name).collect(Collectors.toSet());
				 
				 List < List < String >> output = new ArrayList < List < String >> ();
				 for (Player player: players) {
				  List < String > line = new ArrayList < String > ();
				  line.add(player.name);
				  if (defenderName.contains(player.name)) {
				   line.add("SELECT");
				   line.add("DEFENDER");
				  } else if (strikerName.contains(player.name)) {
				   line.add("SELECT");
				   line.add("STRIKER");
				  } else {
				   line.add("REJECT");
				   line.add("NA");
				  }
				  output.add(line);
				 }
				 return output;
				}
	
	
	}


