package twitterlike_p3_;

public class twitter 
{
    private String name;
    private String email;
    private String password;
    private String tweets;
    private int num;
    
    public twitter()
    {
        name = "NAME";
        password = "PASS";
        email = "bob@gmail.com";
        tweets = "";
        num = 1;
    }
    
    public twitter(String n, String p, String e)
    {
        name = n;
        password = p;
        email = e;
        tweets = "";
        num = 1;
    }
    
    public void setname(String u)
    {
        name = u;
    }
    
    public String getname()
    {
        return name;
    }
    
    public void setemail(String e)
    {
        email = e;
    }
    
    public String getemail()
    {
        return email;
    }
    
    public void setpassword(String p)
    {
        password = p;
    }
    
    public String getpassword()
    {
        return password;
    }
    
    public void settweets(String t)
    {
        tweets += num + ". " + t + "\n"; 
        num++;
    }
    public String gettweets(){return tweets;}
    public String gettweets(int x){return tweets;}
}