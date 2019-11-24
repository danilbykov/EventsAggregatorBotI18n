package io.events.aggregator.telegram.i18n

object RussianMessages extends EnglishMessages {

  override val noActiveSubscriptions =
    "Нет активных подписок. Используйте команду <pre>/add</pre>, чтобы добавить подписки."

  override def successfullySubscribed(twitter: String, channel: Option[String]) =
    channel match {
      case Some(name) =>
        s"Канал '${name}' успешно подписан на $twitter!"
      case None =>
        s"Вы успешно подписаны на $twitter!"
    }
  override def alreadySubscribed(twitter: String) = s"Аккаунт $twitter уже мониторится"
  override val unknownError = "Произошла неизвестная ошибка"
  override def accountNotExist(twitter: String) = s"Аккаунт $twitter не существует"
  override def tooManySubscriptions(max: Int) =
    s"Слишком много активных подписок. Только $max подписок для одного пользователя разрешено."

  override def successfullyUnsubscribed(twitter: String) =
    s"Вы успешно отписаны от аккаунта $twitter!"
  override val notSubscribed = "Не могу найти эту подписку!"

  override def chooseSource(channelName: Option[String]) =
    header(channelName) + "Выберите источник:"
  override val chooseSubscriptionForRemoval = "Выберите подписку для удаления:"
  override val noSubscriptions = "Нет активных подписок"

  override def greetMessage(username: String) =
    s"Добро пожаловать, $username! $botName запущен. Используйте команду /add, чтобы подписаться на " +
    "Twitter, Reddit, YouTube или RSS."
  override val helpText = """/add - Подписывает обновления из Twitter, YouTube аккаунтов или RSS лент
    |/addinstagram $account_name - Подписывает на все обновления Instagram аккаунта
    |/addreddit $account_name - Подписывает на все обновления из SubReddit
    |/addrss $url - Подписывает на все обновления из RSS ленты
    |/addtwitch $channel_name - Подписывает на все новые видео из Twitch аккаунта
    |/addtwitter $account_name - Подписывает на все новые твиты из Twitter аккаунта
    |/addyoutube $channel_name - Подписывает на все новые видео из YouTube канала
    |/list - Показывает список всех подписок
    |/help - Показывает эту справку
    |/remove - Удаляет подписку
    |/settings - Настраивает бота для вашего чата:
    |  — Выберите предпочтительный язык
    |  — Выберите предпочтительный шаблон для уведомлений
    |  — Настройте бота для ваших Telegram каналов
    |  — Настройте фильтры для уведомлений
    |  — Ограничьте доступ к боту для других членов группы
    |  — и так далее...""".stripMargin
  override val addUsageText = """Неверные аргументы. Формат: <pre>/add $URL</pre>, где $URL - Twitter URL или Instagram URL. Например, используйте
    |<pre>/add https://twitter.com/cristiano</pre>, чтобы подписаться на Twitter аккаунт или
    |<pre>/add https://www.instagram.com/cristiano/</pre>, чтобы подписаться на Instagram аккаунт""".stripMargin
  override val enterTwitter = "Введите название Twitter аккаунта или URL"
  override val addTwitterUsageText = """Неверные аргументы. Формат: <pre>/addtwitter $account_name</pre> Например, используйте один из следующих форматов:
    |<pre>/addtwitter cristiano</pre> или`
    |<pre>/addtwitter https://twitter.com/cristiano</pre>""".stripMargin
  override val enterInstagram = "Введите название Instagram аккаунта или URL"
  override val addInstagramUsageText = """Неверные аргументы. Формат: <pre>/addinstagram $account_name</pre> Например, используйте один из следующих форматов:
    |<pre>/addinstagram cristiano</pre> или`
    |<pre>/addinstagram https://www.instagram.com/cristiano/</pre>""".stripMargin
  override val enterAtom = "Введите URL для RSS ленты or URL для HTML страницы с RSS"
  override val addAtomUsageText = """Неверные аргументы. Формат: <pre>/addrss $account_name</pre> Например, вы можете использовать следующий формат:
    |<pre>/addrss https://feedforall.com/sample.xml</pre>""".stripMargin
  override val enterReddit = "Бот может мониторить посты в Subreddit'ах и посты отдельных пользователей. Введите название Subreddit'а или имя Reddit пользователя или URL:"
  override val addRedditUsageText = """Неверные аргументы. Формат: <pre>/addreddit $subreddit</pre> Например, используйте один из следующих форматов:
    |<pre>/addreddit cristianoronaldo</pre> или`
    |<pre>/addreddit https://www.reddit.com/r/cristianoronaldo/</pre> или`
    |<pre>/addreddit https://www.reddit.com/user/jdegoes</pre>""".stripMargin
  override val enterYouTubeText = "Введите текст для поиска YouTube канала"
  override val addYouTubeUsageText = """Неверные аргументы. Формат: <pre>/addyoutube search_query</pre> Например, вы можете использовать следующий формат:
    |<pre>/addyoutube Cristiano Ronaldo</pre>""".stripMargin
  override val noYouTubeChannels = "Не найдено YouTube каналов для вашего запроса"
  override val chooseYouTubeChannels = "Следующие каналы были найдены для вашего запроса. Выберите канал для подписки:"
  override val enterTwitchText = "Введите название Twitch канала или URL"
  override val enterTwitchUsageText = """Неверные аргументы. Формат: <pre>/addtwitch $channel_name</pre> Например, используйте один из следующих форматов:
    |<pre>/addtwitch GSL</pre> или
    |<pre>/addtwitch https://www.twitch.tv/gsl</pre>""".stripMargin

  override val noLink = "Текст не найден"
  override val backToBotSettingsButton = "<< Вернуться к настройкам"

  override def botSettings(channelName: Option[String]) =
    header(channelName) + "Настройки:"

  override val permissionsButton = "Разрешения"
  override val restrictButton = "Ограничить"
  override val disableRestrictionButton = "Отключить ограничения"
  override val unrestrictedMode = "Все члены группы могут добавлять/удалять подписки. Нажмите кнопку ниже, " +
    "чтобы ограничить доступ к этим командам и требовать права администратора."
  override val restrictedMode = "Только администраторы могут добавлять/удалять подписки. Нажмите кнопку ниже, " +
    "чтобы предоставить доступ для всех членов группы."
  override val noPermissions = "Только администраторы могут выполнять эту команду"

  override val wordFilter = "Фильтр по словам"
  override val editWordfilterButton = "Редактировать фильтр"
  override val removeWordfilterButton = "Удалить фильтр"
  override def noStopWords(channelName: Option[String]) =
    header(channelName) +
      "Фильтр не установлен. Используйте фильтр, чтобы удалить уведомления, которые содержат " +
      "хотя бы одно слово из фильтра."

  override def stopWords(stopWords: Set[String], channelName: Option[String]) =
    header(channelName) +
      "Фильтр используется, чтобы фильтровать уведомления, которые содержат хотя бы одно указанное слово.\n" +
      s"<b>Фильтр: </b> ${stopWords.mkString(", ")}."
  override val enterStopWords =
    "Укажите список слов, разделенных пробелом. Разрешается использовать не больше 250 символов."
  override val tooLongStopList =
    "Ваше сообщение содержит больше 250 символов. Разрешается использовать только 250."

  override val templatesButton = "Шаблоны"
  override val backToTemplatesButton = "<< Назад к шаблонам"
  override val activeButton = "Активирован"
  override val activateButton = "Активировать"
  override val sendExampleButton = "Выслать пример"
  override val sendImageButton = "Выслать уведомление"
  override val sendVideoButton = "Выслать видео"

  override def twitterTemplatesOverview(channelName: Option[String]) =
    header(channelName) + """Доступно четыре шаблона:
      |1. Ссылка с официальным превью для твита. Используется по умолчанию.
      |2. "Сырая" ссылка с официальным превью для твита. "Сырые" ссылки могут содержать различные спецсимволы, но Telegram клиент не спрашивает подтверждение, когда вы нажимаете на нее. Это позволяет сэкономить один клик.
      |3. Если твит содержит длинный текст, то он может быть сокращен в официальном превью. Этот шаблон всегда содержит полный текст.
      |4. Такой же шаблон, как и предыдущий. Но "сырая" ссылка на твит скрыта текстом 'Открыть твит'.""".stripMargin
  override def instagramTemplatesOverview(channelName: Option[String]) =
    header(channelName) + """Доступно четыре шаблона:
      |1. Ссылка с официальным превью для Instagram. Используется по умолчанию.
      |2. "Сырая" ссылка с официальным превью для Instagram. "Сырые" ссылки могут содержать различные спецсимволы, но Telegram клиент не спрашивает подтверждение, когда вы нажимаете на нее. Это позволяет сэкономить один клик.
      |3. Если Instagram пост содержит длинный текст, то он может быть сокращен в официальном превью. Этот шаблон всегда содержит полный текст.
      |4. Такой же шаблон, как и предыдущий. Но "сырая" ссылка на Instagram пост скрыта текстом 'Открыть в Instagram'.""".stripMargin
  override def redditTemplatesOverview(channelName: Option[String]) =
    header(channelName) + """Доступно три шаблона:
      |1. Ссылка с официальным превью для Reddit. Используется по умолчанию.
      |2. "Сырая" ссылка с официальным превью для Reddit. "Сырые" ссылки могут содержать различные спецсимволы, но Telegram клиент не спрашивает подтверждение, когда вы нажимаете на нее. Это позволяет сэкономить один клик.
      |3. Ссылка с кнопкой Instant View (если доступно). Заметьте, что Instant View не поддерживается всеми Telegram клиентами (например, в браузерах) и Instant View не работают, если пост имеет 18+ ограничение.""".stripMargin
  override def rssTemplatesOverview(channelName: Option[String]) =
    header(channelName) + """There are three available templates:
      |1. Message consists of Feed Title, Post Title and Post Description."
      |2. Message consists of Feed Title and Post Title.
      |3. Message consists of only Post Title""".stripMargin
  override def youtubeTemplatesOverview(channelName: Option[String]) =
    header(channelName) + """Доступно два шаблона:
      |1. Ссылка с официальным превью для YouTube. Используется по умолчанию.
      |2. "Сырая" ссылка с официальным превью для YouTube. "Сырые" ссылки могут содержать различные спецсимволы, но Telegram клиент не спрашивает подтверждение, когда вы нажимаете на нее. Это позволяет сэкономить один клик.
      |3. Messages consists of Post Title and decorated link with official YouTube post preview.
      |4. Messages consists of Post Title, Post Description and decorated link with official YouTube post preview.""".stripMargin

  override def retweetedByWithLink(url: String, author: String): String =
    s"""<a href="$url">Ретвитнуто</a> <b>$author</b>"""
  override def retweetedBy(author: String): String =
    s"""Ретвитнуто <b>$author</b>"""
  override val openTweet = "Открыть твит"
  override val slidesNote = "(*) Этот пост содержит <b>несколько</b> фото. Нажмите ссылку, чтобы посмотреть другие."
  override val openInInstagram = "Открыть в Instagram"
  override val openInReddit = "Открыть в Reddit"
  override val commentInSubreddit = "Комментарий в Subreddit"
  override def videoScheduledOnYouTube(author: String, url: String) =
    s"""Пользователь <b>$author</b> запланировал <a href="$url">новое видео</a>"""
  override val readMore = "Читать больше..."
  override def twitchVideo(user: String, url: String, directUrl: String) =
    s"""<b>$user</b> (Twitch Видео)
      |Ссылка на видео: $url
      |Прямая ссылка на видео: $directUrl""".stripMargin
  override def twitchStream(user: String, url: String, directUrl: String, chatUrl: String) =
    s"""<b>$user</b> (Twitch Стрим)
      |Ссылка на стрим: $url
      |Прямая ссылка на стрим: $directUrl
      |Ссылка на чат: $chatUrl""".stripMargin

  override val forwardRetweetsButton = "Пересылать ретвиты?"
  override val forwardRetweetsButton2 = "Пересылать ретвиты"
  override val omitRetweetsButton = "Пропускать ретвиты"
  override def forwardRetweetsStateOverview(onlyTweets: Boolean, channelName: Option[String]) =
    if (onlyTweets) {
      header(channelName) +
        "Все ретвиты отфильтровываются. Только твиты пересылаются в Telegram. Нажмите кнопку ниже, чтобы отправлять " +
        "все посты из Twitter, включая твиты и ретвиты. Эта настройка не влияет на другие ресурсы: Instagram, Reddit, " +
        "YouTube и так далее."
    } else {
      header(channelName) +
        "Все Twitter посты (включая твиты и ретвиты) пересылаются в Telegram. Нажмите кнопку ниже, чтобы удалять " +
        "ретвиты и отправлять только твиты. Эта настройка не влияет на другие ресурсы: Instagram, Reddit, YouTube и так далее."
    }

  override val receiveNewFeatureButton = "Получать уведомления о новых возможностях бота"
  override val turnOnNewFeatureButton = "Включать уведомления о новых возможностях бота"
  override val turnOffNewFeatureButton = "Отключить уведомления о новых возможностях бота"
  override def sendFeaturesNotifications(send: Boolean, channelName: Option[String]) =
    if (send) {
      header(channelName) + s"Уведомления о новых возможностях в $botName включены. Отключите эти уведомления, нажав кнопку ниже."
    } else {
      header(channelName) + s"Уведомления о новых возможностях в $botName отключены. Включите эти уведомления, нажав кнопку ниже. " +
      """Вы можете проверять <a href="https://twitter.com/EventsAggregat1">Twitter аккаунт</a>, где публикуются информация обо всех изменениях."""
    }

  override val bindWithChannelButton = "Связать с Telegram каналом"
  override val addNewChannelButton = "Добавить новый канал"
  override val unbindChannelButton = "Отвязать канал"
  override val removeButton = "Удалить"
  override val noChannelsBound = s"Нет связанных каналов. Используйте кнопку ниже, чтобы связать $botName с вашим каналом."
  override val notBoundChannels =
    "Нажмите кнопку ниже, чтобы связать канал с этим чатом и управлять подписками в канале"
  override def channelBound(channelName: String) =
    s"Канал <b>${channelName}</b> связан с этим чатом. Вы можете отвязать канал, чтобы перейти в стандартный режим " +
    "или связать чат с другим каналом, чтобы изменять подписки."
  override val addingChannel = s"Введите название вашего канала. Убедитесь, что $botName уже добавлен как администратор " +
    "и вы являетесь создателем этого канала."
  override def channelNotFound(channelName: String) =
    s"Канал '${channelName}' не найден ."
  override val notCreator = "Только создатель канала может связать канал с чатом."
  override val notAdmin = s"Бот $botName должен быть добавлен как администратор в ваш канал."
  override def channelExists(channelName: String) =
    s"Канал '${channelName}' уже связан с этим каналом."
  override val channelDoesNotExist = "Канал не существует"
  override def channelDefined(channelName: String) =
    s"Канал '${channelName}' добавлен успешно. Выберите этот канал в меню, чтобы управлять подписками в нем."
  override val channelDoesNotAlreadyExist =
    "Этот канал уже не существует. Обновите список каналов."

  override val instagramBroken = "Instagram блокирует получение данных с их страниц. Мониторинг аккаунтов Instagram " +
    "остановлен."

  override val resumeButton = "Восстановить"
  override val deleteButton = "Удалить"
  override val inactiveUser = "Вы бы неактивны в течение долгого времени и все подписки приостановлены. " +
    "Хотели бы вы восстановить мониторинг этих подписок?"
  override val monitoringResumed = "Мониторинг всех ваших подписок восстановлен!"
  override val monitoringCancelled = "Все ваши подписки удалены."
  override def tooLongInactive(daysLeft: Int) =
    "Пожалуйста, подтвердите, что вы все еще пользуетесь вашими подписками. Вы можете сделать это, введя " +
    s"любую команду (/help или /list). В противном случае ваши подписки будут остановлены через $daysLeft дней."
  override val monitoringPaused =
    "Мониторинг ваших подписок был приостановлен, потому что вы были неактивны в течение длительного " +
    "времени. Вы можете перезапустить мониторинг в любое время, используя кнопку 'Восстановить', или " +
    " удалить подписки, используя кнопку 'Удалить'."

  override val language = "Язык"
  override val chooseLanguageBtn =
    "Выберите язык"
  override def chooseLanguage(channelName: Option[String]) =
    header(channelName) + "Выберите язык:"
}
