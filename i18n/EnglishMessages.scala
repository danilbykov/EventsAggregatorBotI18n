package io.events.aggregator.telegram.i18n

trait EnglishMessages extends AbstractMessages with BaseMessages {

  override val noActiveSubscriptions =
    "No active subscriptions. Use command <pre>/add</pre> to add subscriptions"

  override def successfullySubscribed(twitter: String, channel: Option[String]) =
    channel match {
      case Some(name) =>
        s"Channel '${name}' is subscribed on $twitter successfully!"
      case None =>
        s"Successfully subscribed on $twitter!"
    }
  override def alreadySubscribed(twitter: String) = s"Account $twitter is already monitored"
  override val unknownError = "Unknown error occurred"
  override def accountNotExist(twitter: String) = s"Account $twitter doesn't exist"
  override def tooManySubscriptions(max: Int) =
    s"Too many active subscriptions. Only $max subscriptions per user is allowed."

  override def successfullyUnsubscribed(twitter: String) = s"Successfully unsubscribed from $twitter!"
  override val notSubscribed = "Can not find this subscription!"

  override def chooseSource(channelName: Option[String]) =
    header(channelName) + "Choose source:"
  override val chooseSubscriptionForRemoval = "Choose subscription for removal:"
  override val noSubscriptions = "No active subscriptions"

  override def greetMessage(username: String) =
    s"Hello $username! $botName is started. Use command /add to subscribe on " +
    "Twitter, Reddit, YouTube or RSS."
  override val helpText = """/add - Subscribes on all new tweets from Twitter, Instagram account or RSS feed
    |/addinstagram $account_name - Subscribes on all new photos from Instagram account
    |/addreddit $account_name - Subscribes on updates of SubReddit
    |/addrss $url - Subscribes on updates of RSS feed
    |/addtwitch $channel_name - Subscribes on all videos from Twitch account
    |/addtwitter $account_name - Subscribes on all new tweets from Twitter account
    |/addyoutube $channel_name - Subscribes on all new videos from YouTube channel
    |/list - Shows list of all subscriptions
    |/help - Shows this help
    |/remove - Removes subscription
    |/settings - Customizes bot for your chat:
    |  — Choose preferred language
    |  — Choose preferred template for subscriptions
    |  — Setup bot for your Telegram channels
    |  — Configure wordfilter
    |  — Restrict access to bot in group
    |  — and so on""".stripMargin
  override val addUsageText = """Invalid arguments. Usage: <pre>/add $URL</pre> where $URL is Twitter URL or Instagram URL. For example, use
    |<pre>/add https://twitter.com/cristiano</pre> to monitor Twitter account or
    |<pre>/add https://www.instagram.com/cristiano/</pre> to monitor Instagram account""".stripMargin
  override val enterTwitter = "Enter Twitter account name or URL"
  override val addTwitterUsageText = """Invalid arguments. Usage: <pre>/addtwitter $account_name</pre> For example, you may use one of following formats:
    |<pre>/addtwitter cristiano</pre> or
    |<pre>/addtwitter https://twitter.com/cristiano</pre>""".stripMargin
  override val enterInstagram = "Enter Instagram account name or URL"
  override val addInstagramUsageText = """Invalid arguments. Usage: <pre>/addinstagram $account_name</pre> For example, you may use one of following formats:
    |<pre>/addinstagram cristiano</pre> or
    |<pre>/addinstagram https://www.instagram.com/cristiano/</pre>""".stripMargin
  override val enterAtom = "Enter URL to RSS feed or URL to HTML page with RSS"
  override val addAtomUsageText = """Invalid arguments. Usage: <pre>/addrss $account_name</pre> For example, you may use following command:
    |<pre>/addrss https://feedforall.com/sample.xml</pre>""".stripMargin
  override val enterReddit = "Bot can monitor posts in SubReddit as well as posts of Reddit users. Enter Subreddit name or Reddit username or URL."
  override val addRedditUsageText = """Invalid arguments. Usage: <pre>/addreddit $subreddit</pre> For example, you may use following commands:
    |<pre>/addreddit cristianoronaldo</pre> or
    |<pre>/addreddit https://www.reddit.com/r/cristianoronaldo/</pre> or
    |<pre>/addreddit https://www.reddit.com/user/jdegoes</pre>""".stripMargin
  override val enterYouTubeText = "Enter text to search YouTube channels."
  override val addYouTubeUsageText = """Invalid arguments. Usage: <pre>/addyoutube search_query</pre> For example, you may use following command:
    |<pre>/addyoutube Cristiano Ronaldo</pre>""".stripMargin
  override val noYouTubeChannels = "No YouTube channels found for your query"
  override val chooseYouTubeChannels = "Following channels were found for your query. Please choose channel for subscription:"
  override val enterTwitchText = "Enter Twitch channel name or URL"
  override val enterTwitchUsageText = """Invalid arguments. Usage: <pre>/addtwitch $channel_name</pre> For example, you may use following commands:
    |<pre>/addtwitch GSL</pre> or
    |<pre>/addtwitch https://www.twitch.tv/gsl</pre>""".stripMargin

  override val noLink = "No text found"
  override val backToBotSettingsButton = "<< Back To Bot Settings"

  override def botSettings(channelName: Option[String]) =
    header(channelName) + "Bot Settings:"

  override val onlyForAdmins = "Only admins are allowed to execute this command"
  override val permissionsButton = "Permissions"
  override val restrictButton = "Restrict"
  override val disableRestrictionButton = "Disable restrictions"
  override val unrestrictedMode = "All members of this group can add/remove subscriptions. Click button below to " +
    "restrict these commands and require administrator permissions."
  override val restrictedMode = "Only administrators can add/remove subscriptions. Click button below to " +
    "provide access for all members of this group."
  override val noPermissions = "Only Administrator users can execute this action!"

  override val wordFilter = "Wordfilter"
  override val editWordfilterButton = "Edit Wordfilter"
  override val removeWordfilterButton = "Remove Wordfilter"
  override def noStopWords(channelName: Option[String]) =
    header(channelName) +
      "Wordfilter is not set. Use Wordfilter to filter out posts which contain at least " +
      "one word from Wordfilter."
  override def stopWords(stopWords: Set[String], channelName: Option[String]) =
    header(channelName) +
      "Wordfilter is used to filter out posts which contain at least " +
      s"one word from Wordfilter.\n <b>Wordfilter: </b> ${stopWords.mkString(", ")}."
  override val enterStopWords =
    "Please enter space-separated list of words. No more than 250 characters is allowed."
  override val tooLongStopList = "Your message exceeds 250 characters. No more than 250 characters is allowed."

  override val templatesButton = "Templates"
  override val backToTemplatesButton = "<< Back To Templates"
  override val activeButton = "Active"
  override val activateButton = "Activate"
  override val sendExampleButton = "Send Example"
  override val sendImageButton = "Send Image"
  override val sendVideoButton = "Send Video"

  override def twitterTemplatesOverview(channelName: Option[String]) =
    header(channelName) + """There are four available templates:
      |1. Decorated link with official Tweet preview. This is used by default.
      |2. Raw link with official Tweet preview. Raw links look "ugly" but Telegram client doesn't ask confirmation when you click on it. So this saves one click.
      |3. If Tweet is long then text can be truncated in official preview. This template always shows full text.
      |4. The same template as third template. But link to source Tweet is decorated by text 'Open Tweet'.""".stripMargin
  override def instagramTemplatesOverview(channelName: Option[String]) =
    header(channelName) + """There are four available templates:
      |1. Decorated link with official Instagram post preview. This is used by default.
      |2. Raw link with official Instagram post preview. Raw links look "ugly" but Telegram client doesn't ask confirmation when you click on it. So this saves one click.
      |3. If Instagram post is long then text can be truncated in official preview. This template always shows full text. Works well for Single photo, video but Instagram posts with multiple images are not supported. Only first image is rendeded.
      |4. The same template as third template. But link to source Instagram post is decorated by text 'Open in Instagram'.""".stripMargin
  override def redditTemplatesOverview(channelName: Option[String]) =
    header(channelName) + """There are three available templates:
      |1. Decorated link with official Reddit post preview. This is used by default.
      |2. Raw link with official Reddit post preview. Raw links look "ugly" but Telegram client doesn't ask confirmation when you click on it. So this saves one click.
      |3. Decorated link with Instant View button. Please note that Instant Views are not supported by some Telegram clients (for example, in browser) and Instant View doesn't work if post is restricted for 18+ community.""".stripMargin
  override def youtubeTemplatesOverview(channelName: Option[String]) =
    header(channelName) + """There are two available templates:
      |1. Decorated link with official YouTube post preview. This is used by default.
      |2. Raw link with official YouTube post preview. Raw links look "ugly" but Telegram client doesn't ask confirmation when you click on it. So this saves one click.""".stripMargin

  override def retweetedByWithLink(url: String, author: String): String =
    s"""<a href="$url">Retweeted</a> by <b>$author</b>"""
  override def retweetedBy(author: String): String =
    s"""Retweeted by <b>$author</b>"""
  override val openTweet = "Open Tweet"
  override val slidesNote = "(*) This post contains <b>multiple</b> photos. Click link to review others."
  override val openInInstagram = "Open in Instagram"
  override val openInReddit = "Open in Reddit"
  override val commentInSubreddit = "Comment in Subreddit"
  override def videoScheduledOnYouTube(author: String, url: String) =
    s"""User <b>$author</b> scheduled a <a href="$url">new video</a>"""
  override val readMore = "Read more..."
  override def twitchVideo(user: String, url: String, directUrl: String) =
    s"""<b>$user</b> (Twitch Video)
      |Link to video: $url
      |Direct link to video: $directUrl""".stripMargin
  override def twitchStream(user: String, url: String, directUrl: String, chatUrl: String) =
    s"""<b>$user</b> (Twitch Stream)
      |Link to stream: $url
      |Direct link to stream: $directUrl
      |Link to chat: $chatUrl""".stripMargin

  override val forwardRetweetsButton = "Forward Retweets?"
  override val forwardRetweetsButton2 = "Forward Retweets"
  override val omitRetweetsButton = "Omit Retweets"
  override def forwardRetweetsStateOverview(onlyTweets: Boolean, channelName: Option[String]) =
    if (onlyTweets) {
      header(channelName) +
        "All Retweets are filtered out. Only Tweets are forwarded in Telegram. Click button below to send all " +
        "posts from Twitter including Tweets and Retweets. This setting doesn't affect on another services: " +
        "Instagram, Reddit, YouTube and so on."
    } else {
      header(channelName) +
        "All Twitter posts (including Tweets and Retweets) are forwarded in Telegram. Click button below " +
        "to filter out Retweets and send only Tweets. This setting doesn't affect on another services: " +
        "Instagram, Reddit, YouTube and so on."
    }

  override val receiveNewFeatureButton = "Receive New Feature Notifications?"
  override val turnOnNewFeatureButton = "Turn on New Feature Notifications"
  override val turnOffNewFeatureButton = "Turn off New Feature Notifications"
  override def sendFeaturesNotifications(send: Boolean, channelName: Option[String]) =
    if (send) {
      header(channelName) + s"Notifications about new features in $botName are enabled. Turn off these notifications using button below."
    } else {
      header(channelName) + s"Notifications about new features in $botName are disabled. Turn on these notifications " +
      """using button below. Alternatively you can follow this <a href="https://twitter.com/EventsAggregat1">Twitter account</a>""" +
      " to check for last enhancements."
    }

  override val bindWithChannelButton = "Bind With Telegram Channel"
  override val addNewChannelButton = "Add New Channel"
  override val unbindChannelButton = "Unbind channel"
  override val removeButton = "Remove"
  override val noChannelsBound = s"No channels bound. Use button below to connect $botName with your channel."
  override val notBoundChannels = "Click button below to bind channel with this chat and manage subscriptions in channel"
  override def channelBound(channelName: String) =
    s"Channel <b>${channelName}</b> is bound with this chat. You can unbind channel to use chat in regular mode " +
    "or bind with another channel to update subscriptions."
  override val addingChannel = s"Enter your channel name. Please make sure that $botName is already added as " +
    "administrator and you are creator of this channel."
  override def channelNotFound(channelName: String) =
    s"Channel '${channelName}' not found."
  override val notCreator = "Only creator of channel can bind channel with chat."
  override val notAdmin = s"Bot $botName must be added in your channel as administrator."
  override def channelExists(channelName: String) =
    s"Channel '${channelName}' is already bound with this chat."
  override val channelDoesNotExist = "Channel is not defined"
  override def channelDefined(channelName: String) =
    s"Channel '${channelName}' is added successfully. Select this channel in menu to manage subscriptions."
  override val channelDoesNotAlreadyExist =
    "This channel does not already exist. Update list of channels."

  override val instagramBroken = "Instagram prevents getting data from their pages. Monitoring Instagram " +
    "accounts is disabled."

  override val resumeButton = "Resume"
  override val deleteButton = "Delete"
  override val inactiveUser = "You were inactive during long time and all subscriptions are paused. " +
    "Would you like resume these subscriptions?"
  override val monitoringResumed = "Monitoring of all your subscriptions are resumed!"
  override val monitoringCancelled = "All your subscriptions are deleted."
  override def tooLongInactive(daysLeft: Int) =
    "Please confirm that you still use this bot. You can do this by entering any command " +
    s"(for example, /help or /list). Otherwise your subscriptions will be paused in $daysLeft days."
  override val monitoringPaused =
    "Monitoring of your subscriptions was paused because you were inactive during long time. You " +
    "can restart monitoring at any time using button 'Resume' or delete subscriptions using " +
    "button 'Delete'."

  override val language = "Language"
  override def chooseLanguage(channelName: Option[String]) =
    header(channelName) + "Choose language:"
}

object EnglishMessages extends EnglishMessages
