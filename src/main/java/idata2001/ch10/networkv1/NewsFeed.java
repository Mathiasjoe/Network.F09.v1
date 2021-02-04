package idata2001.ch10.networkv1;

import java.util.ArrayList;

/**
 * The NewsFeed class stores news posts for the news feed in a social network 
 * application.
 * 
 * Display of the posts is currently simulated by printing the details to the
 * terminal. (Later, this should display in a browser.)
 * 
 * This version does not save the data to disk, and it does not provide any
 * search or ordering functions.
 * 
 * @author Michael Kölling and David J. Barnes
 * @version 0.1
 */
public class NewsFeed
{
    //private ArrayList<MessagePost> messages;
    //private ArrayList<PhotoPost> photos;

    private ArrayList<Post> posts;

    /**
     * Construct an empty news feed.
     */
    public NewsFeed()
    {
        //messages = new ArrayList<>();
        //photos = new ArrayList<>();

        this.posts = new ArrayList<>();
    }

    /**
     * Add a text post to the news feed.
     * 
     //* @param The text post to be added.
     */
    public void addPost(Post post )
    {
        posts.add(post);
    }


    /**
     * Show the news feed. Currently: print the news feed details to the
     * terminal. (To do: replace this later with display in web browser.)
     */
    public void show()
    {
        // display all text posts
        for(Post post : this.posts) {
            post.display();
            System.out.println();   // empty line between posts
        }

    }

    public static void main(String[] args) {
        NewsFeed newsFeed = new NewsFeed();

        MessagePost messagePost = new MessagePost("Arne", "God morgen!!");
        //Post messagePost = new MessagePost("Arne", "God morgen!!");

        System.out.println(messagePost.getText());
        System.out.println(messagePost.getTimeStamp());

        newsFeed.addPost(messagePost);

        PhotoPost photoPost = new PhotoPost("Jens", "Winter.jpg", "Wonderful winter holliday!");
        newsFeed.addPost(photoPost);

        newsFeed.show();
    }
}
