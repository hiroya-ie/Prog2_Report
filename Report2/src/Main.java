import java.util.Scanner;
import jp.ac.uryukyu.ie.e195738.Chatbot;

public class Main {
    public static void main(String[] args){
        String[] dataset = {"greeting\tはい! お呼びですか?",
                "何歳\tそれはおもしろい質問ですね。",
                "歌って\tすみませんが、それはできません。",
                "おみくじ\tえっと…ラッキーアイテムは、MacBookだと書いてありますよ。",
                "other\tすみません、よくわかりません。",
                "bye.\tお話しできて楽しかったです……"};

        String input, reply; //botへの入力文、応答文を保存するための変数
        Scanner in = new Scanner(System.in);
        int count = 0;

        Chatbot bot = new Chatbot("Sirii", dataset); //インスタンス生成
        bot.greeting();
        while( true ){
            System.out.println("（入力待ち）");
            input = in.nextLine();
            count++;

            reply = bot.reply(input);
            System.out.println(reply);
            if( input.equals("bye.") ){
                break;
            }
        }
        System.out.println("あなたとの" + count + "回の会話内容が、私をさらにアップデートしてくれます。");
    }
}