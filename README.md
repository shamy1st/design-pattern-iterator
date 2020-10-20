# Java Implementation of Iterator Design Pattern

**Iterator** design pattern used to traverse a container and access the container's elements. ([wiki](https://en.wikipedia.org/wiki/Iterator_pattern))
### Problem: 
You have a browser history urls, and you want to iterate through urls.
Any change on the implementation of BrowserHistory urls will require a change in the main loop.

    public class BrowserHistory {
        private List<String> urls = new ArrayList<>();
        
        public void push(String url) {
            urls.add(url);
        }
        
        public String pop() {
            String url = urls.get(urls.size()-1);
            urls.remove(urls.size()-1);
            return url;
        }

        public List<String> getUrls() {
            return urls;
        }
    }

    public class Main {
        public static void main(String[] args) {
            BrowseHistory history = new BrowseHistory();
            history.push("http://url1");
            history.push("http://url2");
            history.push("http://url3");

            for(int i=0;i<history.getUrls().size();i++) {
                System.out.println(history.getUrls().get(i));
            }
        }
    }
### Solution:
![](https://github.com/shamy1st/design-pattern-iterator-java/blob/main/iterator-solution-uml.png)
