import java.util.ArrayList;

public class Blog {
    public ArrayList<BlogPost> Blogs;
    public Blog() {
        Blogs = new ArrayList<>();
    }

    public void add(BlogPost blogpost) {
        this.Blogs.add(blogpost);
    }

    public void delete(int k) {
            this.Blogs.remove(k);
    }

    public void update(int x, BlogPost writeSomething) {
            this.Blogs.set(x, writeSomething);
    }

    public static void main(String[] args) {
        Blog posztok = new Blog();
        BlogPost postOne = new BlogPost("John Doe", "Lorem Ipsum", "Lorem ipsum dolor sit amet.", "2000.05.04.");
        BlogPost postTwo = new BlogPost("Tim Urban", "Wait but why", "A popular long-form, stick-figure-illustrated blog about almost everything.", "2010.10.10.");
        BlogPost postThree = new BlogPost("William Turton", "One Engineer Is Trying to Get IBM to Reckon With Trump", "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.", "2017.03.28.");

        posztok.add(postOne);
        posztok.add(postTwo);
        posztok.add(postThree);

        posztok.delete(2);
        posztok.update(1, new BlogPost("Jane Doe", "dlfjlf", "lsdfldnflf lfdlkf f sdfmfdjlkf", "2014. 10. 23."));


    }



}
