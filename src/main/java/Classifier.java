import java.util.HashMap;
import java.util.Map;

public class Classifier {
    private Map<String, String> categories;

    public void addCategory(String item, String category){
        categories.put(item, category);
    }

    public String getCategory(String item){
        String myCategory = "";
        if (categories.get(item)!=null){
            myCategory = categories.get(item);
        }
        return myCategory;
    }

    public Classifier() {
        categories = new HashMap<String, String>();

    }
}
