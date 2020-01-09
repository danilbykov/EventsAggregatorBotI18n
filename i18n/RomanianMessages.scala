package io.events.aggregator.telegram.i18n

/**
 * Created by @dminca
 */
object RomanianMessages extends EnglishMessages {

  override val noActiveSubscriptions =
    "Nici o subscripție activă. Folosiți comanda <pre>/add</pre> pentru a adăuga subscripții"

  override def successfullySubscribed(twitter: String, channel: Option[String]) =
    channel match {
      case Some(name) =>
        s"Canalul '${name}' s-a abonat cu succes la $twitter !"
      case None =>
        s"Abonat cu succes la $twitter!"
    }
  override def alreadySubscribed(twitter: String) = s"Contul $twitter este deja urmărit"
  override val unknownError = "S-a produs o eroare necunoscută"
  override def accountNotExist(twitter: String) = s"Contul $twitter nu există"
  override def tooManySubscriptions(max: Int) =
    s"Prea multe subscripții. Sunt permise numai $max subscripții per utilizator."

  override def successfullyUnsubscribed(twitter: String) = s"Dezabonat cu succes de la $twitter!"
  override val notSubscribed = "Această subscripție nu se poate găsi!"

  override def chooseSource(channelName: Option[String]) =
    header(channelName) + "Alegeți sursa:"
  override val chooseSubscriptionForRemoval = "Marcați subscripția pentru ștergere:"
  override val noSubscriptions = "Nici o subscripție activă"

  override def greetMessage(username: String) =
    s"Salut $username! $botName a pornit. Folosește comanda /add pentru a te subscrie la " +
      "Twitter, Reddit, YouTube sau RSS."
  override val helpText = """/add - Subscrie la toate noutățile din Twitter, Instagram sau RSS feed
                            |/addinstagram $account_name - Subscrie la toate pozele noi din contul de Instagram
                            |/addreddit $account_name - Subscrie la noutățile din SubReddit
                            |/addrss $url - Subscrie la noutățile din RSS feed
                            |/addtwitch $channel_name - Subscrie la toate video-urile din contul Twitch
                            |/addtwitter $account_name - Subscrie la toate tweet-urile din contul Twitter
                            |/addyoutube $channel_name - Subscrie la toate video-urile noi al canalului de YouTube
                            |/list - Arată o listă cu toate subscripțiile
                            |/help - Arată aceste instrucțiuni
                            |/remove - Șterge subscripția
                            |/settings - Configurează bot-ul pentru chat-ul tău:
                            |  — Selectează limba
                            |  — Alege un template pentru subscripții
                            |  — Configurează bot-ul pentru canalele tale Telegram
                            |  — Configurează wordfilter
                            |  — Restricționează accesul bot-ului în grup
                            |  — și așa mai departe""".stripMargin
  override val addUsageText = """Argumente invalide. Exemplu: <pre>/add $URL</pre> unde $URL este Twitter URL sau Instagram URL. De exemplu, folosește
                                |<pre>/add https://twitter.com/cristiano</pre> pentru a monitoriza contul Twitter, sau
                                |<pre>/add https://www.instagram.com/cristiano/</pre> pentru a monitoriza contul Instagram""".stripMargin
  override val enterTwitter = "Adaugă numele contului de Twitter sau URL"
  override val addTwitterUsageText = """Argumente invalide. Exemplu: <pre>/addtwitter $account_name</pre> Poți folosi, spre exemplu, unul din următoarele formate:
                                       |<pre>/addtwitter cristiano</pre> or
                                       |<pre>/addtwitter https://twitter.com/cristiano</pre>""".stripMargin
  override val enterInstagram = "Adaugă numele contului de Instagram sau URL"
  override val addInstagramUsageText = """Argumente invalide. Exemplu: <pre>/addinstagram $account_name</pre> Poți folosi, spre exemplu, unul din următoarele formate:
                                         |<pre>/addinstagram cristiano</pre> or
                                         |<pre>/addinstagram https://www.instagram.com/cristiano/</pre>""".stripMargin
  override val enterAtom = "Adaugă URL sau feed RSS sau URL la pagina HTML cu RSS"
  override val addAtomUsageText = """Argumente invalide. Exemplu: <pre>/addrss $account_name</pre> Poți folosi, de exemplu, următoarea comandă:
                                    |<pre>/addrss https://feedforall.com/sample.xml</pre>""".stripMargin
  override val enterReddit = "Bot-ul nu poate urmări postările din SubReddit cât și postările utilizatorilor Reddit. Adaugă numele Subreddit-ului sau username-ul Reddit sau URL."
  override val addRedditUsageText = """Argumente invalide. Exemplu: <pre>/addreddit $subreddit</pre> Poți folosi, de exemplu, următoarele comenzi:
                                      |<pre>/addreddit cristianoronaldo</pre> or
                                      |<pre>/addreddit https://www.reddit.com/r/cristianoronaldo/</pre> or
                                      |<pre>/addreddit https://www.reddit.com/user/jdegoes</pre>""".stripMargin
  override val enterYouTubeText = "Introdu text pentru a căuta canale de YouTube."
  override val addYouTubeUsageText = """Argumente invalide. Exemplu: <pre>/addyoutube search_query</pre> Poți folosi, de exemplu, următoarea comandă:
                                       |<pre>/addyoutube Cristiano Ronaldo</pre>""".stripMargin
  override val noYouTubeChannels = "No YouTube channels found for your query"
  override val chooseYouTubeChannels = "Following channels were found for your query. Please choose channel for subscription:"
  override val enterTwitchText = "Enter Twitch channel name or URL"
  override val enterTwitchUsageText = """Argumente invalide. Exemplu: <pre>/addtwitch $channel_name</pre> Poți folosi, de exemplu, următoarele comenzi:
                                        |<pre>/addtwitch GSL</pre> or
                                        |<pre>/addtwitch https://www.twitch.tv/gsl</pre>""".stripMargin

  override val noLink = "Nu s-a găsit textul"
  override val backToBotSettingsButton = "<< Înapoi la setările bot-ului"

  override def botSettings(channelName: Option[String]) =
    header(channelName) + "Setări Bot:"

  override val onlyForAdmins = "Numai administratorii au voie să execute această comandă"
  override val permissionsButton = "Permisiuni"
  override val restrictButton = "Restricționează"
  override val disableRestrictionButton = "Dezactivează restricțiile"
  override val unrestrictedMode = "Toți membrii acestui grup pot adăuga/șterge subscripții. Apasă butonul de jos pentru " +
    "a restricționa aceste comenzi și a permite numai administratorilor."
/*  override val restrictedMode = "Only administrators can add/remove subscriptions. Click button below to " +
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
  override def rssTemplatesOverview(channelName: Option[String]) =
    header(channelName) + """There are three available templates:
                            |1. Message consists of Feed Title, Post Title and Post Description."
                            |2. Message consists of Feed Title and Post Title.
                            |3. Message consists of only Post Title""".stripMargin
  override def youtubeTemplatesOverview(channelName: Option[String]) =
    header(channelName) + """There are four available templates:
                            |1. Decorated link with official YouTube post preview. This is used by default.
                            |2. Raw link with official YouTube post preview. Raw links look "ugly" but Telegram client doesn't ask confirmation when you click on it. So this saves one click.
                            |3. Messages consists of Post Title and decorated link with official YouTube post preview.
                            |4. Messages consists of Post Title, Post Description and decorated link with official YouTube post preview.""".stripMargin

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
  override val chooseLanguageBtn =
    "Choose language"
  override def chooseLanguage(channelName: Option[String]) =
    header(channelName) + "Choose language:"*/
}
