public class ReadArticleService{
    //유일한 객체를 정적 필드에 저장
    private static ReadArticleService instance = new ReadArticleService();

    //유일한 객체에 접근할 수 있는 정적메서드 정의
    public static ReadArticleService getInstance(){
        return instance;
    }
    //생성자를 private으로 설정해서 외부에서 접근하지 못함
    private ReadArticleService();
}