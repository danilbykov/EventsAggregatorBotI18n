package io.events.aggregator.telegram.i18n

object ChineseMessages extends EnglishMessages {

  override val noActiveSubscriptions =
    "当前无订阅。使用命令 <pre>/add</pre> 来添加订阅"

  override def successfullySubscribed(twitter: String, channel: Option[String]) =
    channel match {
      case Some(name) =>
        s"Channel '${name}' 成功订阅 $twitter !"
      case None =>
        s"成功订阅 $twitter!"
    }
  override def alreadySubscribed(twitter: String) = s"Account $twitter 已经订阅"
  override val unknownError = "未知错误发生"
  override def accountNotExist(twitter: String) = s"Account $twitter 不存在"
  override def tooManySubscriptions(max: Int) =
    s"订阅已满. 每人只能订阅 $max 个."

  override def successfullyUnsubscribed(twitter: String) = s"成功退订 $twitter!"
  override val notSubscribed = "找不到这个订阅!"

  override def chooseSource(channelName: Option[String]) =
    header(channelName) + "选择订阅源:"
  override val chooseSubscriptionForRemoval = "选择要退订的订阅源:"
  override val noSubscriptions = "当前无订阅"

  override def greetMessage(username: String) =
    s"欢迎 $username 我的朋友! $botName 已经启动了。 使用命令 /add 来订阅 " +
    "Twitter, Reddit, YouTube 或 RSS."
  override val helpText = """/add - 订阅来查看来自Twitter,Instagram,Youtube或RSS的新消息
    |/addinstagram $account_name - 订阅来查看Instgram帐户的所有新照片
    |/addreddit $account_name - 订阅来查看reddit社区的新帖子
    |/addrss $url - 订阅来查看RSS的新消息
    |/addtwitch $channel_name - 订阅来查看Twitch帐户的新视频或直播提醒
    |/addtwitter $account_name - 订阅来查看Twitter帐户的新推文
    |/addyoutube $channel_name - 订阅来查看Youtube帐户的新视频
    |/list - 查看订阅清单
    |/help - 帮助
    |/remove - 移除订阅
    |/settings - 自定义你的机器人:
    |  — 选择偏好语言
    |  — 选择偏好的订阅模板
    |  — 添加机器人到你的频道
    |  — 配置关键词过滤器
    |  — 在群组中限制对bot的访问
    |  — 其它""".stripMargin
  override val addUsageText = """无效的参数。 用法: <pre>/add $URL</pre> where $URL is Twitter URL or Instagram URL. 例如, 使用命令
    |<pre>/add https://twitter.com/cristiano</pre> 来追踪推特帐户 或
    |<pre>/add https://www.instagram.com/cristiano/</pre> 来追踪Instgram帐户""".stripMargin
  override val enterTwitter = "输入Twitter帐户名 或 URL"
  override val addTwitterUsageText = """无效的参数。 用法: <pre>/addtwitter $account_name</pre> 例如, 你可以使用下面的一个模板:
    |<pre>/addtwitter cristiano</pre> or
    |<pre>/addtwitter https://twitter.com/cristiano</pre>""".stripMargin
  override val enterInstagram = "输入 Instagram帐户名 或 URL"
  override val addInstagramUsageText = """. Usage: <pre>/addinstagram $account_name</pre> 例如, 你可以使用下面的一个模板:
    |<pre>/addinstagram cristiano</pre> 或
    |<pre>/addinstagram https://www.instagram.com/cristiano/</pre>""".stripMargin
  override val enterAtom = "输入 URL 或 带有RSS的URL 来订阅RSS"
  override val addAtomUsageText = """无效的参数。 用法: <pre>/addrss $account_name</pre>ex 例如, 你可以使用下面的一个模板:
    |<pre>/addrss https://feedforall.com/sample.xml</pre>""".stripMargin
  override val enterReddit = "Bot可以监视SubReddit中的帖子以及Reddit用户的帖子。 输入 Subreddit 名字 或 Reddit 用户名 或 URL。"
  override val addRedditUsageText = """无效的参数。 用法: <pre>/addreddit $subreddit</pre> 例如, 你可以使用下面的一个模板:
    |<pre>/addreddit cristianoronaldo</pre> 或
    |<pre>/addreddit https://www.reddit.com/r/cristianoronaldo/</pre> 或
    |<pre>/addreddit https://www.reddit.com/user/jdegoes</pre>""".stripMargin
  override val enterYouTubeText = "输入 YouTube 频道名"
  override val addYouTubeUsageText = """无效的参数。 用法: <pre>/addyoutube search_query</pre> 例如, 你可以使用下面的一个模板:
    |<pre>/addyoutube Cristiano Ronaldo</pre>""".stripMargin
  override val noYouTubeChannels = " YouTube 频道未找到，请检查你的输入"
  override val chooseYouTubeChannels = "为你的查询找到了以下频道.请选择要订阅的Youtube频道:"
  override val enterTwitchText = "输入 Twitch 频道名 或 URL"
  override val enterTwitchUsageText = """无效的参数。 用法: <pre>/addtwitch $channel_name</pre> 例如, 你可以使用下面的一个模板:
    |<pre>/addtwitch GSL</pre> 或
    |<pre>/addtwitch https://www.twitch.tv/gsl</pre>""".stripMargin

  override val noLink = "未找到"
  override val backToBotSettingsButton = "<< 回到设置"

  override def botSettings(channelName: Option[String]) =
    header(channelName) + "Bot Settings:"

  override val onlyForAdmins = "只允许管理员执行此命令"
  override val permissionsButton = "访问权限"
  override val restrictButton = "限制"
  override val disableRestrictionButton = "关闭限制"
  override val unrestrictedMode = "该组的所有成员都可以添加/移除订阅。点击下面的按钮 " +
    "限制这些命令，需要管理员权限才能使用这些命令"
  override val restrictedMode = "只有管理员可以添加/移除订阅。点击下面的按钮" +
    "所有群组成员都可以添加/移除订阅"
  override val noPermissions = "只有管理员用户才能执行此操作!"

  override val wordFilter = "关键词过滤器"
  override val editWordfilterButton = "配置关键词过滤器"
  override val removeWordfilterButton = "移除关键词过滤器"
  override def noStopWords(channelName: Option[String]) =
    header(channelName) +
      " 没有设置关键词过滤器。使用关键词过滤器过滤掉至少包含以下内容的帖子" +
      "关键词"
  override def stopWords(stopWords: Set[String], channelName: Option[String]) =
    header(channelName) +
      "关键词过滤器用于过滤至少包含以下内容的帖子 " +
      s"关键词\n <b>关键词过滤器: </b> ${stopWords.mkString(", ")}."
  override val enterStopWords =
    "请输入以空格分隔的文字组（例如 you love me）。 最多不能超过250个字符"
  override val tooLongStopList = "你输入的文字超过了250个字符。最多不能超过250个字符"

  override val templatesButton = "模板"
  override val backToTemplatesButton = "<< 回到模板"
  override val activeButton = "已启用"
  override val activateButton = "未启用"
  override val sendExampleButton = "观看范例"
  override val sendImageButton = "观看图片"
  override val sendVideoButton = "观看视频"

  override def twitterTemplatesOverview(channelName: Option[String]) =
    header(channelName) + """有四个可用模板:
      |1. 带有官方Tweet预览的链接。默认模板
      |2. 带有官方Tweet预览的行链接。尽管行链接看起来很丑，但是单击它可直接跳转到Twitter客户端 ，所以方便了一手^_^
      |3. 如果推文过长，则可以使用即时预览。这个模板显示推特全文
      |4. 和模板三相同。 但是到源推文的链接会被'Open Tweet'替代。""".stripMargin
  override def instagramTemplatesOverview(channelName: Option[String]) =
    header(channelName) + """有四个可用模板:
      |1. 带有官方Instagram帖子预览的链接。默认模板
      |2. 带有官方Instagram帖子预览的行链接。尽管行链接看起来很丑，但是单击它可直接跳转到Instagram客户端 ，所以方便了一手^_^
      |3. 如果帖子过长，则可以使用即时预览。这个模板显示帖子全文。只支持单张照片或视频。仅渲染第一张图像
      |4. 和模板三相同。但是到Instagram帖子的链接会被‘Open in Instagram'替代 。""".stripMargin
  override def redditTemplatesOverview(channelName: Option[String]) =
    header(channelName) + """有三个可用模板：
      |1. 带有官方Reddit帖子预览的链接。默认模板
      |2. 带有官方Reddit帖子预览的行链接。尽管行链接看起来很丑，但是单击它可直接跳转到Reddit客户端 ，所以方便了一手^_^
      |3. 可以使用即时预览。注意有些Telegram客户端并不支持 (例如, 网页端)，并且如果帖子是18+限制级即时预览不会工作""".stripMargin
  override def youtubeTemplatesOverview(channelName: Option[String]) =
    header(channelName) + """有两个可用模板:
      |1. 带有官方Youube视频预览的链接。默认模板
      |2. 带有官方Youtube视频预览的行链接。尽管行链接看起来很丑，但是单击它可直接跳转到Youtube客户端 ，所以方便了一手^_^""".stripMargin

  override def retweetedByWithLink(url: String, author: String): String =
    s"""<a href="$url">Retweeted</a> by <b>$author</b>"""
  override def retweetedBy(author: String): String =
    s"""Retweeted by <b>$author</b>"""
  override val openTweet = "Open Tweet"
  override val slidesNote = "(*) This post contains <b>multiple</b> photos. 点."
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

  override val forwardRetweetsButton = "查看转推（转发的推文）?"
  override val forwardRetweetsButton2 = "查看"
  override val omitRetweetsButton = "忽略"
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

  override val receiveNewFeatureButton = "接受新功能提醒?"
  override val turnOnNewFeatureButton = "打开新功能提醒"
  override val turnOffNewFeatureButton = "关闭新功能提醒"
  override def sendFeaturesNotifications(send: Boolean, channelName: Option[String]) =
    if (send) {
      header(channelName) + s"$botName 新功能提醒已开启. 单击下方按钮来关闭这些提醒"
    } else {
      header(channelName) + s"$botName 新功能提醒已关闭. 单击下方按钮来打开这些提醒 " +
      """ 或者你可以关注这个 <a href="https://twitter.com/EventsAggregat1">Twitter account</a>""" +
      " 来查看新功能"
    }

  override val bindWithChannelButton = "绑定Telegram频道"
  override val addNewChannelButton = "添加新频道"
  override val unbindChannelButton = "解绑频道"
  override val removeButton = "移除"
  override val noChannelsBound = s"未绑定频道， 单击下方按钮把 $botName 绑定到你的频道"
  override val notBoundChannels = "单击下面的按钮将频道与此聊天绑定并管理频道中的订阅"
  override def channelBound(channelName: String) =
    s"Channel <b>${channelName}</b> 已与该聊天绑定. 您可以解除频道绑定，以便在常规模式下使用聊天 " +
    "或者与另一个频道绑定以更新订阅"
  override val addingChannel = s"输入你的频道名(注意是你频道的邀请链接的最后一部分）. 请确认你给了bot管理员权限并且你是频道主"
  override def channelNotFound(channelName: String) =
    s"Channel '${channelName}' not found."
  override val notCreator = "只有频道主可以绑定该聊天到频道"
  override val notAdmin = s"Bot $botName 必须是频道管理员"
  override def channelExists(channelName: String) =
    s"Channel '${channelName}' 已经和该聊天绑定"
  override val channelDoesNotExist = "频道不存在"
  override def channelDefined(channelName: String) =
    s"Channel '${channelName}' 成功绑定. 在菜单中选择此频道以管理订阅"
  override val channelDoesNotAlreadyExist =
    "频道现在不存在.请更新频道列表."

  override val instagramBroken = "Instagram阻止从其页面获取数据. 监视的Instagram帐户已禁用."

  override val resumeButton = "恢复"
  override val deleteButton = "删除"
  override val inactiveUser = "你长时间处于非活动状态，所有订阅已暂停. " +
    "你希望恢复它们吗?"
  override val monitoringResumed = "你所有的订阅已恢复!"
  override val monitoringCancelled = "你所有的订阅被删除."
  override def tooLongInactive(daysLeft: Int) =
    "请输入任何命令以确认你仍在使用这个bot " +
    s"(例如, /help 或 /list). 否则你的订阅将在$daysLeft 天后被暂停."
  override val monitoringPaused =
    "你所有的订阅已被暂停因为你已经离线太久." +
    "你可以单击'恢复'来恢复它们或者单击‘删除’来删除它们 " 
  override val language = "语言"
  override def chooseLanguage(channelName: Option[String]) =
    header(channelName) + "选择语言:"
}
