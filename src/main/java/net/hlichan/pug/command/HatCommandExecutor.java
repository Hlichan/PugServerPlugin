package net.hlichan.pug.command;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

public class HatCommandExecutor implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String s, @NotNull String[] args) {
        if (!(sender instanceof Player)) { //プレイヤーじゃなかったら
            sender.sendMessage("コマンドを実行できるのはプレイヤーのみです。");
        } else { //プレイヤーだったら
            Player p = (Player) sender; //senderをPlayer型にキャストし変数名pで宣言
            if (p.getInventory().getItemInMainHand().getType() == Material.AIR) {
                p.sendMessage("被りたいアイテムを持ってください。");
            } else {
                ItemStack helmet = p.getInventory().getHelmet();
                p.getInventory().setHelmet(p.getInventory().getItemInMainHand());
                p.getInventory().setItemInMainHand(helmet);
            }
        }
        return true;
    }
}
