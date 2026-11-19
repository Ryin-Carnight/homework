import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Character
{
    private int level = 54, hp = 48, mp = 427;
    private String name = "うわの", job = "がくしゃ";
    private boolean isMale = true;
    //private ArrayList<Equip> equips = ["マーファー", "ダンシングメイル", "シルバートレイ", "あおいビニールがさ"]
    private HashMap<String, Integer> map = new HashMap<>();

    public Character(String name, String job, boolean isMale)
    {
        this.name = name;
        this.job = job;
        this.isMale  = isMale;
        level = 1;
        hp = 5;
        mp = 5;
        map.put("STR", 5);
        map.put("DEX", 5);
        map.put("VIT", 5);
        map.put("INT", 5);
        map.put("LUK", 5);
        map.put("MaxHP", 5);
        map.put("MaxMP", 5);
        map.put("ATK", 5);
        map.put("DEF", 5);
        map.put("Ex", 0);
    }

    public boolean addEx(int ex)
    {
        int[] status = {
            map.get("STR"),
            map.get("DEX"),
            map.get("VIT"),
            map.get("INT"),
            map.get("LUK"),
            map.get("MaxHP"),
            map.get("MaxMP"),
            map.get("ATK"),
            map.get("DEF"),
            map.get("Ex")
        };

        status[9] += ex;
        map.put("Ex", status[9]);
        int before_level = this.level;
        status[9] -= this.level*10;
//        for(int i = 0;status[9] >= 0;i++)
//        {
//            status[9] -= 10;
//            this.level++;
//        }
        for(int i = 0;i < status.length - 1;i++)
        {
            status[i] += 2*(this.level - before_level);
            switch (i) {
                case 0:
                    map.put("STR", status[i]);
                    break;
                case 1:
                    map.put("DEX", status[i]);
                    break;
                case 2:
                    map.put("VIT", status[i]);
                    break;
                case 3:
                    map.put("INT", status[i]);
                    break;
                case 4:
                    map.put("LUK", status[i]);
                    break;
                case 5:
                    map.put("MaxHP", status[i]);
                    break;
                case 6:
                    map.put("MaxMP", status[i]);
                    break;
                case 7:
                    map.put("ATK", status[i]);
                    break;
                case 8:
                    map.put("DEF", status[i]);
                    break;
            }
        }
        if(before_level < this.level)
        {
            return true;
        }else return false;
    }

    public String toString()
    {
        String male = "";
        if(this.isMale == true)
            male = "M";
        else male = "F";
        return this.name +
                "(" +
                this.job + ":" + male + ") LV" +
                this.level + " HP[" +
                this.hp + "/" +
                map.get("MaxHP") + "] MP[" +
                this.mp + "/" +
                map.get("MaxMP") + "]";
    }

}
