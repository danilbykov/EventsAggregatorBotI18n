package io.events.aggregator.telegram.i18n

/**
 * Created by @Sac_hin
 */
object GermanMessages extends EnglishMessages {

  override val noActiveSubscriptions =
    "Keine aktiven Abonnements. Verwenden Sie den Befehl, <pre>/add</pre> um die Abonnements hinzuzufügen."

  override def successfullySubscribed(twitter: String, channel: Option[String]) =
    channel match {
      case Some(name) =>
        s"Kanal'${name}' ist auf $twitter erfolgreich abonniert!"
      case None =>
        s"Erfolgreich auf $twitter abonniert!"
    }
  override def alreadySubscribed(twitter: String) = s"Das Konto $twitter wird schon kontrolliert"
  override val unknownError = "Unknown error occurred"
  override def accountNotExist(twitter: String) = s"Das Konto $twitter existiert nicht"
  override def tooManySubscriptions(max: Int) =
    s"Zu viele aktive Abonnements. Nur $max Abonnements pro Benutzer ist erlaubt."

  override def successfullyUnsubscribed(twitter: String) = s"Erfolgreich von $twitter abgemeldet!"
  override val notSubscribed = "Dieses Abonnement kann nicht gefunden werden!"

  override def chooseSource(channelName: Option[String]) =
    header(channelName) + "Bitte wählen Sie die Quelle aus :"
  override val chooseSubscriptionForRemoval = "Wählen Sie das Abonnement aus,das Sie entfernen möchten:"
  override val noSubscriptions = "Keine aktiven Abonnements"

  override def greetMessage(username: String) =
    s"Hallo $username! $botName ist aktiviert. Benutzen Sie den Befehl, /add um " +
    "Twitter, Reddit, YouTube oder RSS zu abonnieren."
  override val helpText = """/add - Abonniert alle neuen Tweets vom Twitter, Instagram Konto oder RSS feed
    |/addinstagram $account_name - Abonniert alle neuen Fotos vom Instagram Konto
    |/addreddit $account_name -  Abonniert alle Neuigkeiten von SubReddit
    |/addrss $url - Abonniert alle Neuigkeiten vom RSS feed
    |/addtwitch $channel_name - Abonniert alle Videos vom Twitch Konto
    |/addtwitter $account_name - Abonniert alle neuen Tweets vom Twitter Konto
    |/addyoutube $channel_name - Abonniert alle neuen Videos vom YouTube Kanal
    |/list - Liste aller Abos anzeigen
    |/help - Dieses Hilfemenü anzeigen
    |/remove - Abonnements entfernen
    |/settings - Den Bot für Ihren Chat konfigurieren:
    |  — Sprache auswählen
    |  — Bevorzugte Vorlage für das Abonnement auswählen
    |  — Den Bot für Ihre Telegrammkanäle konfigurieren
    |  — Den Wortfilter konfigurieren
    |  — Den Zugriff auf den Bot in der Gruppe beschränken
    |  — usw""".stripMargin
  override val addUsageText = """Ungültige Argumente. Anwendung: <pre>/add $URL</pre> wo $URL ist Twitter URL oder Instagram URL. zum Beispiel, Benutzen Sie
    |<pre>/add https://twitter.com/cristiano</pre> um Twitter Konto zu kontrollieren oder
    |<pre>/add https://www.instagram.com/cristiano/</pre> Instagram Konto zu kontrollieren""".stripMargin
  override val enterTwitter = "Bitte den Namen oder die URL Ihres Twitter-Kontos eingeben"
  override val addTwitterUsageText = """Ungültige Argumente. Anwendung: <pre>/addtwitter $account_name</pre> zum Beispiel, Sie dürfen eines der folgenden Formate verwenden:
    |<pre>/addtwitter https://twitter.com/cristiano</pre>""".stripMargin
  override val enterInstagram = "Bitte den Namen oder die URL Ihres Instagram-Kontos eingeben"
  override val addInstagramUsageText = """Ungültige Argumente. Anwendung: <pre>/addinstagram $account_name</pre> zum Beispiel, Sie dürfen eines der folgenden Formate verwenden:
    |<pre>/addinstagram cristiano</pre> oder
    |<pre>/addinstagram https://www.instagram.com/cristiano/</pre>""".stripMargin
  override val enterAtom = "Bitte die URL des RSS Feeds oder URL von einer HTML Seite mit RSS eingeben"
  override val addAtomUsageText = """Ungültige Argumente. Anwendung: <pre>/addrss $account_name</pre> zum Beispiel, Sie dürfen eines der folgenden Befehle verwenden:
    |<pre>/addinstagram cristiano</pre> oder:
    |<pre>/addrss https://feedforall.com/sample.xml</pre>""".stripMargin
  override val enterReddit = "Der Bot kann sowohl Posts auf SubReddit als auch Posts von den Reddit Benutzern kontrollieren. Bitte den Namen des Subreddits oder den Namen des Reddits oder URL eingeben."
  override val addRedditUsageText = """Ungültige Argumente. Anwendung: <pre>/addreddit $subreddit</pre> zum Beispiel, Sie dürfen eines der folgenden Befehle verwenden:
    |<pre>/addreddit cristianoronaldo</pre> oder
    |<pre>/addreddit https://www.reddit.com/r/cristianoronaldo/</pre> oder
    |<pre>/addreddit https://www.reddit.com/user/jdegoes</pre>""".stripMargin
  override val enterYouTubeText = "Geben Sie bitte den Text ein, um Youtube-Kanäle durchzusuchen."
  override val addYouTubeUsageText = """Ungültige Argumente. Anwendung: <pre>/addyoutube search_query</pre> zum Beispiel, Sie dürfen eines der folgenden Befehle verwenden:
    |<pre>/addyoutube Cristiano Ronaldo</pre>""".stripMargin
  override val noYouTubeChannels = "Keine Youtube-Kanäle für Ihre Suchanfrage gefunden."
  override val chooseYouTubeChannels = "Folgende Youtube-Kanäle für Ihre Suchanfrage gefunden. Bitte einen Kanal für das Abonnement auswählen:"
  override val enterTwitchText = "Bitte den Namen des Twitch Kanals oder URL eingeben"
  override val enterTwitchUsageText = """Ungültige Argumente. Anwendung: <pre>/addtwitch $channel_name</pre> zum Beispiel, Sie dürfen eines der folgenden Befehle verwenden:
    |<pre>/addtwitch GSL</pre> oder
    |<pre>/addtwitch https://www.twitch.tv/gsl</pre>""".stripMargin

  override val noLink = "Keine Texte gefunden"
  override val backToBotSettingsButton = "<< Zurück zu den Bot-Einstellungen"

  override def botSettings(channelName: Option[String]) =
    header(channelName) + "Bot-Einstelllungen:"

  override val onlyForAdmins = "Nur Admins dürfen diesen Befehl ausführen."
  override val permissionsButton = "Berechtigungen"
  override val restrictButton = "Einschränken"
  override val disableRestrictionButton = "Einschränkungen deaktivieren"
  override val unrestrictedMode = "Alle Mitglieder dieser Gruppe können Abonnements hinzufügen/entfernen. Klicken Sie auf die Schaltfläche unten, um " +
    "diese Befehle zu beschränken und Administratorrechte zu erfordern."
  override val restrictedMode = "Nur Admins können Abonnements hinzufügen/entfernen. Klicken Sie auf die Schaltfläche unten, um " +
    "den Zugang für alle Mitglieder dieser Gruppe zu ermöglichen."
  override val noPermissions = "Nur Admins dürfen diesen Befehl ausführen!"

  override val wordFilter = "Wortfilter"
  override val editWordfilterButton = "den Wortfilter bearbeiten"
  override val removeWordfilterButton = "den Wordfilter entfernen"
  override def noStopWords(channelName: Option[String]) =
    header(channelName) +
      "Der Wortfilter ist nicht konfiguriert. Bitte den Wortfilter benutzen, um die Posts herauszufiltern, die mindestens " +
      "ein Wort vom Worfilter beinhalten."
  override def stopWords(stopWords: Set[String], channelName: Option[String]) =
    header(channelName) +
      "Wortfilter wurde benutzt, um die Posts herauszufilten, die mindestens" +
      s"ein Wort vom Wordfilter beinhalten.\n <b>Wordfilter: </b> ${stopWords.mkString(", ")}."
  override val enterStopWords =
    "Bitte eine durch Leerzeichen getrennte Liste von Wörtern eingeben. Maximal 250 Zeichen sind zulässig."
  override val tooLongStopList = "Ihre Nachricht enthält mehr als 250 Zeichen. Maximal 250 Zeichen sind zulässig."

  override val templatesButton = "Vorlagen"
  override val backToTemplatesButton = "<< Zurück zu den Vorlagen"
  override val activeButton = "Aktiv"
  override val activateButton = "Aktivieren"
  override val sendExampleButton = "Beispiel senden"
  override val sendImageButton = "Bild senden"
  override val sendVideoButton = "Video senden"

  override def twitterTemplatesOverview(channelName: Option[String]) =
    header(channelName) + """Es gibt vier verfügbare Vorlagen:
      |1. Dekorierter Link mit offizieller Tweet-Vorschau. Dies wird standardmäßig verwendet.
      |2. Roher Link mit offizieller Tweet-Vorschau. Rohe Links sehen "hässlich" aus, aber der Telegramm-Client fragt nach einer Bestätigung nicht, wenn Sie darauf klicken. Das spart also einen Klick.
      |3. Wenn Tweet lang ist, kann der Text in der offiziellen Vorschau abgeschnitten werden. Diese Vorlage zeigt immer den Volltext.
      |4. Dieselbe Vorlage wie die dritte Vorlage. Der Link zum Quell-Tweet ist jedoch mit dem Text "Open Tweet" verziert'.""".stripMargin
  override def instagramTemplatesOverview(channelName: Option[String]) =
    header(channelName) + """Es gibt vier verfügbare Vorlagen:
      |1. Dekorierter Link mit offizieller Instagram-Post-Vorschau. Dies wird standardmäßig verwendet.
      |2. Roher Link mit offizieller Vorschau des Instagram-Posts. Rohe Links sehen "hässlich" aus, aber der Telegramm-Client fragt nach einer Bestätigung nicht, wenn Sie darauf klicken. Das spart also einen Klick.
      |3. Wenn der Instagram-Beitrag lang ist, kann der Text in der offiziellen Vorschau abgeschnitten werden. Diese Vorlage zeigt immer den Volltext. Funktioniert gut für einzelne Fotos und Videos, aber Instagram-Posts mit mehreren Bildern werden nicht unterstützt. Nur das erste Bild wird gerendert.
      |4. Dieselbe Vorlage wie die dritte Vorlage. Der Link zum Quell-Instagram-Post ist jedoch mit dem Text "In Instagram öffnen" verziert'.""".stripMargin
  override def redditTemplatesOverview(channelName: Option[String]) =
    header(channelName) + """Es gibt drei verfügbare Vorlagen:
      |1. Dekorierter Link mit offizieller Reddit-Post-Vorschau. Dies wird standardmäßig verwendet..
      |2. Roher Link mit offizieller Vorschau des Reddit-Posts. Rohe Links sehen "hässlich" aus, aber der Telegramm-Client fragt nach einer Bestätigung nicht, wenn Sie darauf klicken. Das spart also einen Klick..
      |3. Verzierter Link mit der Schaltfläche "Sofortansicht". Bitte beachten Sie, dass Instant Views von einigen Telegramm-Clients (z. B. im Browser) nicht unterstützt werden und Instant View funktioniert nicht, wenn der Beitrag auf die Community ab 18 beschränkt ist.""".stripMargin
  override def youtubeTemplatesOverview(channelName: Option[String]) =
    header(channelName) + """There are two available templates:
      |1. Dekorierter Link mit offizieller Youtube-Post-Vorschau. Dies wird standardmäßig verwendet.
      |2. Roher Link mit offizieller Vorschau des Youtube-Posts. Rohe Links sehen "hässlich" aus, aber der Telegramm-Client fragt nach einer Bestätigung nicht, wenn Sie darauf klicken. Das spart also einen Klick.""".stripMargin

  override def retweetedByWithLink(url: String, author: String): String =
    s"""<a href="$url">Retweetet</a> by <b>$author</b>"""
  override def retweetedBy(author: String): String =
    s"""Retweetet von <b>$author</b>"""
  override val openTweet = "Tweet öffnen"
  override val slidesNote = "(*) Dieser Beitrag enthält <b>mehrere</b> Fotos. Klicken Sie auf den Link, um andere zu überprüfen."
  override val openInInstagram = "In Instagram öffnen"
  override val openInReddit = "In Reddit öffnen"
  override val commentInSubreddit = "In Subreddit kommentieren"
  override def videoScheduledOnYouTube(author: String, url: String) =
    s"""Der Benutzer <b>$author</b> hat <a href="$url"> ein neues Video geplant</a>"""
  override val readMore = "Mehr lesen..."
  override def twitchVideo(user: String, url: String, directUrl: String) =
    s"""<b>$user</b> (Twitch Video)
      |Link zum Video: $url
      |Direkter Link zum Video: $directUrl""".stripMargin
  override def twitchStream(user: String, url: String, directUrl: String, chatUrl: String) =
    s"""<b>$user</b> (Twitch Stream)
      |Link zu stream: $url
      |Direkter Link zu stream: $directUrl
      |Link zum Chat: $chatUrl""".stripMargin

  override val forwardRetweetsButton = "Retweets weiterleiten?"
  override val forwardRetweetsButton2 = "Retweets weiterleiten"
  override val omitRetweetsButton = "Retweets weglassen"
  override def forwardRetweetsStateOverview(onlyTweets: Boolean, channelName: Option[String]) =
    if (onlyTweets) {
      header(channelName) +
        "Alle Retweets sind herausgefiltert. Nur Tweets in Telegram werden weitergeleitet. Klicken Sie auf die Schaltfläche unten, um alle " +
        "Posts von Twitter einschließlich Tweets und Retweets zu senden. Diese Einstellung wird sich auf die anderen Dienste wie z.B : " +
        "Instagram, Reddit, YouTube nicht auswirken."
    } else {
      header(channelName) +
        "Alle Twitter Posts(einschließlich Tweets und Retweets) werden in Telegram weitergeleitet. Klicken Sie auf die Schaltfläche unten " +
        "um Retweets herauszufiltern und nur die Tweets zu senden. Diese Einstellung wird sich auf die anderen Dienste wie z.B: " +
        "Instagram, Reddit, YouTube nicht auswirken."
    }

  override val receiveNewFeatureButton = "Benachrichtigungen über neue Funktionen erhalten?"
  override val turnOnNewFeatureButton = "Benachrichtigungen über neue Funktionen aktivieren"
  override val turnOffNewFeatureButton = "Benachrichtigungen über neue Funktionen abschalten"
  override def sendFeaturesNotifications(send: Boolean, channelName: Option[String]) =
    if (send) {
      header(channelName) + s"Benachrichtigungen über neue Funktionen in $botName sind aktiviert. Benachrichtigungen mit der Schaltfläche unten deaktivieren."
    } else {
      header(channelName) + s"Benachrichtigungen über neue Funktionen in $botName sind deaktiviert. Benachrichtigungen mit der Schaltfläche unten aktivieren " +
      """Ersatzweise können Sie dem <a href="https://twitter.com/EventsAggregat1">Twitter Konto</a>""" +
      " folgen, um über die neuesten Updates zu erfahren."
    }

  override val bindWithChannelButton = "Mit dem Telegram-Kanal binden"
  override val addNewChannelButton = "Einen neuen Kanal hinzufügen"
  override val unbindChannelButton = "Den Kanal losbinden"
  override val removeButton = "Entfernen"
  override val noChannelsBound = s"Keine Kanäle gebunden. Bitte verwenden Sie die Schaltfläche unten, um $botName mit Ihrem Kanal zu verbinden."
  override val notBoundChannels = "Klicken Sie auf die Schaltfläche unten, um den Kanal mit diesem Chat zu verbinden und Abonnements im Kanal zu verwalten"
  override def channelBound(channelName: String) =
    s"Der Kanal <b>${channelName}</b> ist mit diesem Chat erfolgreich gebunden. Sie können die Bindung des Kanals aufheben, um den Chat im regulären Modus zu verwenden " +
    "oder mit einem anderen Kanal binden, um die Abonnements zu aktualisieren."
  override val addingChannel = s"Bitte den Namen Ihres Kanals eingeben. Stellen Sie sich sicher, dass $botName ist bereits als Administrator hinzugefügt " +
    "und dass Sie diesen Kanal bereits erstellt haben."
  override def channelNotFound(channelName: String) =
    s"Der Kanal '${channelName}' ist leider nicht gefunden"
  override val notCreator = "Nur der Ersteller des Kanals kann den Kanal mit dem Chat verbinden."
  override val notAdmin = s"Der Bot $botName muss in Ihrem Kanal als Administrator hinzugefügt werden."
  override def channelExists(channelName: String) =
    s"Der Kanal '${channelName}' wurde bereits an diesen Chat gebunden ."
  override val channelDoesNotExist = "Der Kanal ist nicht definiert"
  override def channelDefined(channelName: String) =
    s"Der Kanal '${channelName}' ist erfolgreich hinzugefügt. Wählen Sie diesen Kanal im Menü aus, um Abonnements zu verwalten."
  override val channelDoesNotAlreadyExist =
    "Dieser Kanal existiert noch nicht. Liste der Kanäle aktualisieren."

  override val instagramBroken = "Der Abruf der Daten von Instagram ist momentan verhindert. Das Überwachen von Instagram-Konten wurde deshalb deaktiviert."

  override val resumeButton = "Fortsetzen"
  override val deleteButton = "Löschen"
  override val inactiveUser = "Sie waren lange Zeit inaktiv und alle Abonnements wurden pausiert. " +
    "Möchten Sie diese Abonnements wieder aktivieren??"
  override val monitoringResumed = "Die Überwachung all Ihrer Abonnements wird fortgesetzt!"
  override val monitoringCancelled = "Alle Ihre Abonnements werden erfolgreich gelöscht."
  override def tooLongInactive(daysLeft: Int) =
    "Bitte bestätigen Sie, dass Sie diesen Bot noch verwenden. Sie können dies tun, indem Sie einen beliebigen Befehl eingeben " +
    s"(for example, /help oder /list). Andernfalls werden all Ihrer Abonnement in $daysLeft Tagen pausiert."
  override val monitoringPaused =
    "Die Überwachung Ihrer Abonnements ist pausiert, weil Sie lange Zeit inaktiv waren. Sie " +
    "können die Überwachung jederzeit mit der Schaltfläche 'Fortsetzen' neu starten oder Abonnements mit der Schaltfläche  " +
    "'Löschen' löschen."

  override val language = "Sprache"
  override def chooseLanguage(channelName: Option[String]) =
    header(channelName) + "Bitte die Sprache auswählen:"
}
