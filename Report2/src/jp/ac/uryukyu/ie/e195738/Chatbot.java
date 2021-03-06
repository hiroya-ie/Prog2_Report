package jp.ac.uryukyu.ie.e195738;

public class Chatbot {
    String botname; //botの名前
    ReplyPattern[] patterns; //応答パターン

    /**
     * コンストラクタ1: 既にReplyPattern[]が用意されてる場合。(今回は未使用)
     */
    public Chatbot(String botname, ReplyPattern[] patterns){
        this.botname = botname;
        this.patterns = patterns;
    }

    /**
     * コンストラクタ2: String[]からデータ読み込む場合。
     * @param botname botの名前。
     * @param dataset 応答パターン(String配列)。
     * 
     * 処理1: botnameをthis.botnameに保存する。
     * 処理2: datasetをthis.patternsに保存する。
     */
    public Chatbot(String botname, String[] dataset){
        this.botname = botname;
        this.patterns = new ReplyPattern[dataset.length];
        for (int i=0; i<dataset.length; i++) {
            String[] split = dataset[i].split("\t");
            this.patterns[i] = new ReplyPattern(split[0],split[1]);
        }
    }

    /**
     * patternと完全一致するパターンを検索するメソッド。
     *  case 1: 見つかったら、該当インデックスを返す。
     *  case 2: 見つからない場合には「other」を検索し、そのインデックス素を返す。
     *  case 3: それも見つからない場合には -1 を返す。
     * @param pattern 探す対象。
     * @return インデックス
     */
    public int searchPattern(String pattern) {
        for (int i=0; i<this.patterns.length; i++) {
            if (this.patterns[i].equals(pattern)) {
                return i;
            }
        }
        for (int i=0; i<this.patterns.length; i++) {
            if (this.patterns[i].equals("other")) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 挨拶パターンを用いた挨拶。
     */
    public void greeting(){
        int index = searchPattern("greeting");
        System.out.println(botname + "「" + patterns[index].reply + "」");
    }

    /**
     * ユーザ入力に応じた応答生成。
     * @param pattern ユーザ入力。
     * @return 応答文。"ボット名「応答文」"形式。
     */
    public String reply(String pattern){
        int index = searchPattern(pattern);
        String message = botname + "「" + patterns[index].reply + "」";
        return message;
    }
}
