import org.bukkit.ChatColor;

public class GradientAPI {

    public String generateGradient(String message) {
        StringBuilder gradientMessage = new StringBuilder();
        ChatColor[] colors = {
                ChatColor.RED, ChatColor.GOLD, ChatColor.YELLOW, ChatColor.GREEN, ChatColor.AQUA, ChatColor.BLUE, ChatColor.LIGHT_PURPLE
        };

        int colorIndex = 0;
        for (char c : message.toCharArray()) {
            ChatColor color = colors[colorIndex];
            gradientMessage.append(color + String.valueOf(c));
            colorIndex = (colorIndex + 1) % colors.length;
        }

        return gradientMessage.toString();
    }
}
