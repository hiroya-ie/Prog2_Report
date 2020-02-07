import java.util.Scanner;
import jp.ac.uryukyu.ie.e195738.Chatbot;

public class Main {
    public static void main(String[] args){
        String[] dataset = {"greeting\tじゃ～ん！プロちゃんの驚く顔が見たい野々原茜ちゃん登場ーっ！ね、驚いた？驚いた？茜みたいなダイヤの原石を前にしてビックリしちゃった？",
                "こんにちは\tプロちゃん元気ないね？　茜ちゃんと一緒にプリン食べる？",
                "other\tそんなことよりプロちゃん、茜ちゃんをどうプロデュースするか考えてる？",
                "bye.\t茜ちゃん人形作って待ってるね！"};

        String input, reply; //botへの入力文、応答文を保存するための変数
        Scanner in = new Scanner(System.in);
        int count = 0;

        Chatbot bot = new Chatbot("茜ちゃん", dataset); //インスタンス生成
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
        System.out.println("今日はプロちゃんとたった" + count + "回しか話してないよ？");
    }
}