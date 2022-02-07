package test_3;

public class Word {
    public String word;
    private int count;

    public Word(String word) {
        this.word = word;
        this.count = 0;
        setCount(word);
        firstUpperCase(word);
    }

    public String getWord() {
        return word;
    }

    public int getCount() {
        return count;
    }

    //подсчет количества гласных в слове
    public void setCount(String word) {
        for (char w : word.toCharArray()){
            if ("ЁУЕАОЭЯИЮёуеаоэяию".indexOf(w) != -1){
                this.count++;
            }
        }
    }

    //делать первую гласную букву в слове заглавной
    public void firstUpperCase(String word){
        this.word = word.substring(0,1).toUpperCase() + word.substring(1);
    }

    @Override
    public String toString(){
        return "Cлово: " +
                word + ", кол-во гласных: " +
                count;
    }
}
