## プログラミング2
# レポート課題1: 「チャットボット初号機を作ってみよう」
提出日：2020-00-00  
報告者：195738E 知念弘也  

### 課題概要  

### (1)独自メソッドのコード  
```java:Chatbot.java
class Judge {
    String input; //ユーザ入力を格納する

    Judge(String txt) {
        input = txt; // inputにユーザ入力を保存
        if (input.contains("何歳")) {
            System.out.println("Sirii: それはおもしろい質問ですね。");
        }else if (input.contains("歌って")) {
            System.out.println("Sirii: すみませんが、それはできません。");
        }else if (input.contains("おみくじ")) {
            System.out.println("Sirii: えっと…ラッキーアイテムは、MacBookだと書いてありますよ。");
        }else {
            System.out.println("Sirii: すみません、よくわかりません。");
        }
        System.out.println("入力待ち……"); // 入力を促す説明文
    }
}
```

### (2)実行結果  
```java:
/Library/Java/JavaVirtualMachines/jdk-12.0.2.jdk/Contents/Home/bin/java "-javaagent:/Applications/IntelliJ IDEA CE.app/Contents/lib/idea_rt.jar=58026:/Applications/IntelliJ IDEA CE.app/Contents/bin" -Dfile.encoding=UTF-8 -classpath "/Users/hiroya/Google ドライブ/Programming/Prog2/Prog2_Report/Report1/out/production/Report1" jp.ac.uryukyu.ie.e195738.ChatBot
Sirii: はい! お呼びですか?
入力待ち……
こんにちは
Sirii: すみません、よくわかりません。
入力待ち……
何歳なの？
Sirii: それはおもしろい質問ですね。
入力待ち……
歌ってみて。
Sirii: すみませんが、それはできません。
入力待ち……
おみくじ
Sirii: えっと…ラッキーアイテムは、MacBookだと書いてありますよ。
入力待ち……
bye.
あなたとの5回の会話内容が、私をさらにアップデートしてくれます。
お話しできて楽しかったです……

Process finished with exit code 0
```
###  Javaで書いた際に気づいた点 及び 結果と考察
ユーザー入力の内容を判定する際、優先して識別したい「bye.」の動作のみをmainメソッドに書き、残りは独自メソッドのJudgeに記述した。課題の条件を満たすためには、equalsメソッドを使えばよかったが、もう少し実用性をあげたいと思い、文字列の中に特定の文字列を含むかを判定できるようにした。調べたところ、equalsをcontainsに変更するだけで可能だったため、やってよかった。

### その他
今回のコードでは、System.out.printlnを書きまくってしまったので、次からはもう少し見た目がスマートなコードにしたい。