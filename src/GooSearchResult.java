public class GooSearchResult {
    private String url;
    public GooSearchResult(String url){
        this.url = url;
    }
    public String parseDomain(){
        String[] stringArr = url.split("/");
        return stringArr[2];

    }

    public String getUrl() {
        return url;
    }
}
class GooSearchResultTest {
    public static void main(String[] args) {
        //test.com
        System.out.println(new GooSearchResult("https://test.com").parseDomain());

        //apple.in.mars
        System.out.println(new GooSearchResult("http://apple.in.mars").parseDomain());
    }
}