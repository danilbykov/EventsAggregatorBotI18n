package io.events.aggregator.telegram.i18n

trait AbstractMessages {
  def noActiveSubscriptions: String

  def successfullySubscribed(twitter: String, channel: Option[String]): String
  def alreadySubscribed(twitter: String): String
  val unknownError: String
  def accountNotExist(twitter: String): String
  def tooManySubscriptions(max: Int): String

  def successfullyUnsubscribed(twitter: String): String
  val notSubscribed: String

  def chooseSource(channelName: Option[String]): String
  val chooseSubscriptionForRemoval: String
  val noSubscriptions: String

  def greetMessage(username: String): String
  val helpText: String
  val addUsageText: String
  val enterTwitter: String
  val addTwitterUsageText: String
  val enterInstagram: String
  val addInstagramUsageText: String
  val enterAtom: String
  val addAtomUsageText: String
  val enterReddit: String
  val addRedditUsageText: String
  val enterYouTubeText: String
  val addYouTubeUsageText: String
  val noYouTubeChannels: String
  val chooseYouTubeChannels: String
  val enterTwitchText: String
  val enterTwitchUsageText: String

  val noLink: String
  val backToBotSettingsButton: String

  def botSettings(channelName: Option[String]): String

  val onlyForAdmins: String
  val permissionsButton: String
  val restrictButton: String
  val disableRestrictionButton: String
  val unrestrictedMode: String
  val restrictedMode: String
  val noPermissions: String

  val wordFilter: String
  val editWordfilterButton: String
  val removeWordfilterButton: String
  def noStopWords(channelName: Option[String]): String
  def stopWords(stopWords: Set[String], channelName: Option[String]): String
  val enterStopWords: String
  val tooLongStopList: String

  val templatesButton: String
  val backToTemplatesButton: String
  val activeButton: String
  val activateButton: String
  val sendExampleButton: String
  val sendImageButton: String
  val sendVideoButton: String

  def twitterTemplatesOverview(channelName: Option[String]): String
  def instagramTemplatesOverview(channelName: Option[String]): String
  def redditTemplatesOverview(channelName: Option[String]): String
  def youtubeTemplatesOverview(channelName: Option[String]): String

  def retweetedByWithLink(url: String, author: String): String
  def retweetedBy(author: String): String
  val openTweet: String
  val forwardRetweetsButton: String
  val forwardRetweetsButton2: String
  val omitRetweetsButton: String
  val slidesNote: String
  val openInInstagram: String
  val openInReddit: String
  val commentInSubreddit: String
  def videoScheduledOnYouTube(author: String, url: String): String
  val readMore: String
  def twitchVideo(user: String, url: String, directUrl: String): String
  def twitchStream(user: String, url: String, directUrl: String, chatUrl: String): String

  def forwardRetweetsStateOverview(onlyTweets: Boolean, channelName: Option[String]): String

  val receiveNewFeatureButton: String
  val turnOnNewFeatureButton: String
  val turnOffNewFeatureButton: String
  def sendFeaturesNotifications(send: Boolean, channelName: Option[String]): String

  val bindWithChannelButton: String
  val addNewChannelButton: String
  val unbindChannelButton: String
  val removeButton: String
  val noChannelsBound: String
  val notBoundChannels: String
  def channelBound(channelName: String): String
  val addingChannel: String
  def channelNotFound(channelName: String): String
  val notCreator: String
  val notAdmin: String
  def channelExists(channelName: String): String
  val channelDoesNotExist: String
  def channelDefined(channelName: String): String
  val channelDoesNotAlreadyExist: String

  val instagramBroken: String

  val resumeButton: String
  val deleteButton: String
  val inactiveUser: String
  val monitoringResumed: String
  val monitoringCancelled: String
  def tooLongInactive(daysLeft: Int): String
  val monitoringPaused: String

  val language: String
  def chooseLanguage(channelName: Option[String]): String
}
