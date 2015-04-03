import me.AcePilot10.TDM.TeamType;
 
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
 
public class Teams {
       
        private static List<String> Warden = new ArrayList<String>();
        private static List<String> Prisoners= new ArrayList<String>();
 
        public static void addToTeam(TeamType type, Player player) {
                if(isInTeam(player)) {
                        player.sendMessage(ChatColor.DARK_RED + "You are already in a team!");
                        return;
                }
                switch(type) {
                case WARDEN:
                Warden.add(player.getName());
                break;
                case PRISONERS:
                Prisoners.add(player.getName());
                break;
                }
                player.sendMessage("Added to " + type.name() + " team!");
        }
       
        public static void removeFromTeam(Player player) {
       
        }
        public static boolean isInTeam(Player player) {
                return Warden.contains(player.getName())
                || Prisoners.contains(player.getName());
        }
       
        public static void clearTeams() {
                Warden.clear();
                Prisoners.clear();
        }
        public static List<String> getWarden() {
                return Warden;
        }
        public static List<String> getPrisoners() {
                return Prisoners;
        }
        public static List<String> getAllPlayerInTeams() {
                List<String> combinedTeams = new ArrayList<String>();
                combinedTeams.addAll(Warden);
                combinedTeams.addAll(Prisoners);
                return combinedTeams;
        }      
}
 
 
//Lax here is the TeamType enum
package me.AcePilot10.TDM;
 
public enum TeamType {
        WARDEN,PRISONERS
 
}
