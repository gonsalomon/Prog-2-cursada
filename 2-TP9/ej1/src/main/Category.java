package main;

public class Category extends Component{
    private String description;
    private String imgURL;

    public Category(String description, String imgURL) {
        super();
        this.description = description;
        this.imgURL = imgURL;
    }
}
