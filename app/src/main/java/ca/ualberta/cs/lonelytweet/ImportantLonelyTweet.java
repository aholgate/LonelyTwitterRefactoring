package ca.ualberta.cs.lonelytweet;

import java.util.Date;

/**
 * Created by Ashley on 2017-10-31.
 */


// suggests making class package private
    // if we wanted to we could do this by changing it to "class ImportantLonelyTweet extends LonelyTweet";
// another thing that it mentions is that ImportantLonelyTweet is not instantiated
    // this could be changed by actually using the class somewhere in LonelyTwitterActivity

@SuppressWarnings("DefaultFileTemplate") // adding this to deal with general default file remplate usage
public class ImportantLonelyTweet extends LonelyTweet {

        public ImportantLonelyTweet() {
        }

        public ImportantLonelyTweet(String text, Date date) {
            this.tweetDate = date;
            this.tweetBody = text;
        }

        @Override
        public boolean isValid() {
            // control flow issue, redundant if statement, can be simplified
            // before we had
            /* if (tweetBody.trim().length() == 0
                    || tweetBody.trim().length() > 10) {
                return false;
            }

            return true; */
            // now its much simplier
            return !(tweetBody.trim().length() == 0
                    || tweetBody.trim().length() > 10);

        }
}
