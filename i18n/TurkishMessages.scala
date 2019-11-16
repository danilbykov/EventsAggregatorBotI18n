package io.events.aggregator.telegram.i18n

/**
 * Created by @HolyTotem.
 */
object TurkishMessages extends EnglishMessages {

  override val noActiveSubscriptions =
    "Aktif aboneliğiniz bulunmamamkta. Abonelik eklemek için <pre>/add</pre> komutunu kullanın"

  override def successfullySubscribed(twitter: String, channel: Option[String]) =
    channel match {
      case Some(name) =>
        s"'${name}' kanalı, $twitter aboneliğine dahil edildi!"
      case None =>
        s"Başarıyla abone oldunuz: $twitter!"
    }
  override def alreadySubscribed(twitter: String) = s"$twitter hesabı zaten izleniyor"
  override val unknownError = "Unknown error occurred"
  override def accountNotExist(twitter: String) = s"$twitter hesabı mevcut değil"
  override def tooManySubscriptions(max: Int) =
    s"Çok fazla sayıda aktif aboneliğiniz mevcut. Kullanıcı başına en fazla $max aboneliğe izin verilir."

  override def successfullyUnsubscribed(twitter: String) = s"Başarıyla abonelikten çıktınız: $twitter!"
  override val notSubscribed = "Böyle bir abonelik bulunmuyor!"

  override def chooseSource(channelName: Option[String]) =
    header(channelName) + "Kaynak seçin:"
  override val chooseSubscriptionForRemoval = "Kaldırmak istediğiniz aboneliği seçin:"
  override val noSubscriptions = "Aktif abonelik mevcut değil"

  override def greetMessage(username: String) =
    s"Merhaba $username! $botName botunu başlattınız. /add komutunu kullanarak " +
    "Twitter, Reddit, YouTube veya bir RSS'e abone olabilirsiniz."
  override val helpText = """/add - Twitter'daki tüm yeni tweetlere, Instagram hesabına veya RSS'e abone olun
    |/addinstagram $account_name - Instagram hesabındaki tüm yeni fotoğraflara abone olun
    |/addreddit $account_name - Tüm SubReddit güncellemelerine abone olun
    |/addrss $url - Bir RSS'e abone olun
    |/addtwitch $channel_name - Twitch hesabının tüm videolarına abone olun
    |/addtwitter $account_name - Twitter hesabındaki en yeni tweetleri takibe alın
    |/addyoutube $channel_name - YouTube kanalındaki yeni videolara abone olun
    |/list - Tüm aboneliklerin listesini gösterir
    |/help - Bu yardım metnini gösterir
    |/remove - Abonelik siler
    |/settings - Botunuzu sohbetiniz için özelleştirir:
    |  — Kullandığınız dili seçin
    |  — Abonelikleriniz için istediğiniz şablonu seçin
    |  — Botu Telegram kanallarınız için ayarlayın
    |  — Kelime filtresi belirleyin
    |  — Grubunuzdaki bot erişimini kısıtlayın
    |  — ve fazlası""".stripMargin
  override val addUsageText = """Geçersiz argüman. Kullanımı: <pre>/add $URL</pre> $URL Twitter URL veya Instagram URL olabilir. Örneğin,
    |<pre>/add https://twitter.com/cristiano</pre> ile bir twitter hesabı izleyin veya
    |<pre>/add https://www.instagram.com/cristiano/</pre> ile Instagram hesabına abone olun""".stripMargin
  override val enterTwitter = "Twitter hesabının ismini ya da URL bağlantısını girin"
  override val addTwitterUsageText = """Geçersiz argüman. Kullanımı: <pre>/addtwitter $account_name</pre> Örneğin, aşağıdaki biçimleri kullanabilirsiniz:
    |<pre>/addtwitter cristiano</pre> ya da
    |<pre>/addtwitter https://twitter.com/cristiano</pre>""".stripMargin
  override val enterInstagram = "Instagram hesabının ismini ya da URL bağlantısını girin"
  override val addInstagramUsageText = """Geçersiz argüman. Kullanımı: <pre>/addinstagram $account_name</pre> Örneğin, aşağıdaki biçimleri kullanabilirsiniz:
    |<pre>/addinstagram cristiano</pre> ya da
    |<pre>/addinstagram https://www.instagram.com/cristiano/</pre>""".stripMargin
  override val enterAtom = "RSS beslemesine URL veya RSS ile HTML sayfasına URL'yi girin"
  override val addAtomUsageText = """Geçersiz argüman. Kullanımı: <pre>/addrss $account_name</pre> Örneğin, aşağıdaki biçimleri kullanabilirsiniz:
    |<pre>/addrss https://feedforall.com/sample.xml</pre>""".stripMargin
  override val enterReddit = "Bot, SubReddit'teki yayınları ve Reddit kullanıcılarının yayınlarını izleyebilir. Subreddit adını, Reddit kullanıcı adını veya URL’sini girin."
  override val addRedditUsageText = """Geçersiz argüman. Kullanımı: <pre>/addreddit $subreddit</pre> Örneğin, aşağıdaki biçimleri kullanabilirsiniz:
    |<pre>/addreddit cristianoronaldo</pre> veya
    |<pre>/addreddit https://www.reddit.com/r/cristianoronaldo/</pre> ya da
    |<pre>/addreddit https://www.reddit.com/user/jdegoes</pre>""".stripMargin
  override val enterYouTubeText = "YouTube kanallarını aramak için ismini girin."
  override val addYouTubeUsageText = """Geçersiz argüman. Kullanımı: <pre>/addyoutube search_query</pre> Örneğin, aşağıdaki biçimleri kullanabilirsiniz:
    |<pre>/addyoutube Cristiano Ronaldo</pre>""".stripMargin
  override val noYouTubeChannels = "Bu isimde hiç YouTube kanalı bulunamadı"
  override val chooseYouTubeChannels = "Aramanız için aşağıdaki kanallar bulundu. Lütfen abone için bir kanal seçin:"
  override val enterTwitchText = "Twitch kanalının ismini veya URL bağlantısını girin"
  override val enterTwitchUsageText = """Geçersiz argüman. Kullanımı: <pre>/addtwitch $channel_name</pre> Örneğin, aşağıdaki biçimleri kullanabilirsiniz:
    |<pre>/addtwitch GSL</pre> ya da
    |<pre>/addtwitch https://www.twitch.tv/gsl</pre>""".stripMargin

  override val noLink = "Sonuç bulunamadı"
  override val backToBotSettingsButton = "<< Bot Ayarlarına Geri Dön"

  override def botSettings(channelName: Option[String]) =
    header(channelName) + "Bot Ayarları:"

  override val onlyForAdmins = "Bu komutu yalnızca yöneticilerin çalıştırmasına izin verilir"
  override val permissionsButton = "İzinler"
  override val restrictButton = "Kısıtla"
  override val disableRestrictionButton = "Kısıtlamaları devredışı bırak"
  override val unrestrictedMode = "Bu grubun tüm üyeleri abonelik ekleyebilir/silebilir. Bu komutları " +
    "kısıtlayın veya yönetici izni belirleyin."
  override val restrictedMode = "Yalnızca yöneticiler bir abonelik ekleyebilir/silebilir. Bu komutları " +
    "grubun tüm üyelerinin gerçekleştirmesine izin vermek için butona tıkla."
  override val noPermissions = "Bu işlemi yalnızca Yöneticiler yapabilir!"

  override val wordFilter = "Kelime Filtresi"
  override val editWordfilterButton = "Kelime Filtresini Düzenle"
  override val removeWordfilterButton = "Kelime Filtresini Sil"
  override def noStopWords(channelName: Option[String]) =
    header(channelName) +
      "Kelime Filtresi belirlenmedi. İstemediğiz gönderilerin gelmesini engellemek için " +
      "en az bir kelime belirlemelisiniz."
  override def stopWords(stopWords: Set[String], channelName: Option[String]) =
    header(channelName) +
      "Kelime filtresi en az bir kelime içeren gönderileri " +
      s"filtrelemek için kullanılır.\n <b>Kelime Filtresi: </b> ${stopWords.mkString(", ")}."
  override val enterStopWords =
    "Lütfen boşlukla ayırarak bir kelime listesi girin. En fazla 250 karaktere izin verilir."
  override val tooLongStopList = "Mesajınız 250 karakteri aşıyor. En fazla 250 karaktere izin verilir."

  override val templatesButton = "Şablonlar"
  override val backToTemplatesButton = "<< Şablonlara Geri Dön"
  override val activeButton = "Aktif"
  override val activateButton = "Aktif Et"
  override val sendExampleButton = "Örnek Gönder"
  override val sendImageButton = "Fotoğraf Gönder"
  override val sendVideoButton = "Video Gönder"

  override def twitterTemplatesOverview(channelName: Option[String]) =
    header(channelName) + """Dört adet şablon mevcuttur:
      |1. Resmi Tweet önizlemesi eklenmiş bağlantı. Bu, varsayılan olarak kullanılır.
      |2. Resmi Tweet önizlemeli link. Ham bağlantılar "çirkin" görünür, ancak Telegram istemcisi tıkladığınızda onay istemiyor. Yani bu tek bir tıklamayla tasarruf sağlar.
      |3. Tweet uzunsa, resmi önizlemede metin kesilebilir. Bu şablon her zaman tam metni gösterir.
      |4. Üçüncü şablonla aynı şablon. Ancak kaynak Tweet bağlantısı 'Tweet'i Aç' metni ile ulaşıma kolaylık sağlar.""".stripMargin
  override def instagramTemplatesOverview(channelName: Option[String]) =
    header(channelName) + """Dört adet şablon mevcuttur:
      |1. Resmi Instagram yayın önizlemesine bağlantı ekler. Bu, varsayılan olarak kullanılır.
      |2. Resmi Instagram yayını önizlemesi ile ham link. Ham bağlantılar "çirkin" görünür, ancak Telegram istemcisi tıkladığınızda onay istemiyor. Yani bu tek bir tıklamayla tasarruf sağlar.
      |3. Instagram gönderimi uzunsa, metin resmi önizlemede kesilebilir. Bu şablon her zaman tam metni gösterir. Tek fotoğraf, video için iyi çalışır, ancak birden fazla görüntü içeren Instagram gönderileri desteklenmez. Sadece ilk görüntü gösterilir.
      |4. Üçüncü şablonla aynı şablon. Ancak Instagram gönderisine olan bağlantı 'Instagram'da Aç' metni ile ulaşıma kolaylık sağlar""".stripMargin
  override def redditTemplatesOverview(channelName: Option[String]) =
    header(channelName) + """Üç adet şablon mevcuttur:
      |1. Resmi Reddit yayın önizlemesine bir bağlantı ekler. Bu, varsayılan olarak kullanılır.
      |2. Resmi Reddit yayın önizlemesi ile ham bağlantı. Ham bağlantılar "çirkin" görünür, ancak Telegram istemcisi tıkladığınızda onay istemiyor. Yani bu tek bir tıklamayla tasarruf sağlar.
      |3. Anlık Görünüm butonu eklenmiş bağlantı. Anlık Görünümlerin bazı Telegram istemcileri (örneğin, tarayıcıda) tarafından desteklenmediğini ve gönderinin +18 topluluk için kısıtlanması durumunda Anında Görünüm'ün çalışmadığını lütfen unutmayın.""".stripMargin
  override def youtubeTemplatesOverview(channelName: Option[String]) =
    header(channelName) + """İki adet şablon mevcuttur:
      |1. Resmi YouTube yayın önizlemesine bir bağlantı ekler. Bu, varsayılan olarak kullanılır.
      |2. Resmi YouTube yayını önizlemeli bağlantı. Ham bağlantılar "çirkin" görünür, ancak Telegram istemcisi tıkladığınızda onay istemiyor. Yani bu tek bir tıklamayla tasarruf sağlar.""".stripMargin

  override def retweetedByWithLink(url: String, author: String): String =
    s"""<a href="$url">Retweetlendi</a> by <b>$author</b>"""
  override def retweetedBy(author: String): String =
    s"""Retweetleyen <b>$author</b>"""
  override val openTweet = "Tweet'i Aç"
  override val slidesNote = "(*) Bu yayın <b>birden çok</b> fotoğraf içeriyor. Diğerlerini incelemek için bağlantıyı tıklayın."
  override val openInInstagram = "Instagram'da Aç"
  override val openInReddit = "Reddit'te Aç"
  override val commentInSubreddit = "Subreddit'te Yorum Yapın"
  override def videoScheduledOnYouTube(author: String, url: String) =
    s"""Kullanıcı <b>$author</b> <a href="$url">yeni video</a> zamanladı"""
  override val readMore = "Daha Fazla Oku..."
  override def twitchVideo(user: String, url: String, directUrl: String) =
    s"""<b>$user</b> (Twitch Video)
      |Video linki: $url
      |Videoya direkt link: $directUrl""".stripMargin
  override def twitchStream(user: String, url: String, directUrl: String, chatUrl: String) =
    s"""<b>$user</b> (Twitch Stream)
      |Yayın linki: $url
      |Yayına direkt link: $directUrl
      |Sohbet linki: $chatUrl""".stripMargin

  override val forwardRetweetsButton = "Retweetler İletilsin Mi?"
  override val forwardRetweetsButton2 = "Retweet İletimleri"
  override val omitRetweetsButton = "Retweetleri Çıkar"
  override def forwardRetweetsStateOverview(onlyTweets: Boolean, channelName: Option[String]) =
    if (onlyTweets) {
      header(channelName) +
        "Tüm Retweetler filtrelendi. Telegram'ınıza yalnızca Tweetler iletilecek. Tekrar iletileri açmak " +
        "için aşağıdaki butona tıklayın. Bu ayar diğer hizmetleri etkilemez: " +
        "Instagram, Reddit, YouTube ve diğerleri.."
    } else {
      header(channelName) +
        "Tüm Twitter gönderileri (Tweetler ve Retweetler) Telegram'ınıza iletilecek. İletileri kapatmak için " +
        "aşağıdaki butona tıklayınız. Bu ayar diğer hizmetleri etkilemez: " +
        "Instagram, Reddit, YouTube ve diğerleri.."
    }

  override val receiveNewFeatureButton = "Yeniliklerin Bildirimleri Almak İster Misin?"
  override val turnOnNewFeatureButton = "Yeniliklerin Bildirimlerini Al"
  override val turnOffNewFeatureButton = "Yeniliklerin Bildirimlerini Alma"
  override def sendFeaturesNotifications(send: Boolean, channelName: Option[String]) =
    if (send) {
      header(channelName) + s"$botName içerisinde gerçekleşen yeniliklerin bildirimi etkinleştirildi. Aşağıdaki butonu kullanarak tekrar kapatabilirsin."
    } else {
      header(channelName) + s"$botName içerisinde gerçekleşen yeniliklerin bildirimi devredışı bırakıldı. Aşağıdaki butonu kullanarak tekrar açabilirsin." +
      """Alternatif olarak buraya bakabilirsin <a href="https://twitter.com/EventsAggregat1">Twitter Hesabımız,</a>""" +
      " Yenilikleri beklemede kalın."
    }

  override val bindWithChannelButton = "Telegram Kanalı Bağlayın"
  override val addNewChannelButton = "Yeni Kanal Ekle"
  override val unbindChannelButton = "Kanal Bağlantısını Kaldırın"
  override val removeButton = "Kaldır"
  override val noChannelsBound = s"Hiçbir kanal bağlı değil. Butonu kullanarak $botName botunu kanalınıza bağlayın."
  override val notBoundChannels = "Kanalı bu sohbete bağlamak ve kanaldaki abonelikleri yönetmek için aşağıdaki düğmeye tıklayın"
  override def channelBound(channelName: String) =
    s"Kanal <b>${channelName}</b> bu bota bağlı. Normal modda kullanmal in kanal bağlantısını kaldırın " +
    "ya da kanalınız için yeni abonelikler belirleyin."
  override val addingChannel = s"Kanalınızın ismini girin. Lütfen, $botName botunun kanalınızda ekli," +
    "kurucu veya yönetici yetkilerinin olduğundan emin olun."
  override def channelNotFound(channelName: String) =
    s"'${channelName}' kanalı bulunamadı."
  override val notCreator = "Yalnızca kanalın kurucusu botu kanalla bağlayabilir."
  override val notAdmin = s"$botName botunun kanalınızda ekli ve yönetici olduğundan emin olun."
  override def channelExists(channelName: String) =
    s"'${channelName}' kanalı zaten bu bota bağlı."
  override val channelDoesNotExist = "Kanal tanımlanamadı"
  override def channelDefined(channelName: String) =
    s"'${channelName}' kanalı başarıyla eklendi. Abonelikleri yönetmek için menüden bu kanalı seçin."
  override val channelDoesNotAlreadyExist =
    "Bu kanal mevcut değil. Kanal listenizi güncelleyin."

  override val instagramBroken = "Instagram sayfalarından veri alınmasını önler. " +
    " Instagram hesaplarını izleme devre dışı bırakıldı."

  override val resumeButton = "Devam Et"
  override val deleteButton = "Sil"
  override val inactiveUser = "Uzun zamandır aktif olmadığınızdan tüm abonelikler duraklatılıyor. " +
    "Bu abonelikleri devam ettirmek ister misiniz?"
  override val monitoringResumed = "Tüm aboneliklerinizi takip etmeye devam edin!"
  override val monitoringCancelled = "Tüm abonelikleriniz silindi."
  override def tooLongInactive(daysLeft: Int) =
    "Lütfen hala bu botu kullandığınızı onaylayın. Bunu herhangi bir komut göndererek yapabilirsiniz " +
    s"(örneğin, /help veya /list). Aksi taktirde bütün abonelikleriniz $daysLeft gün sonra durdurulacaktır."
  override val monitoringPaused =
    "Aboneliklerinizi izlemek duraklatıldı, çünkü uzun zamandır aktif değilsiniz. " +
    "'Devam Et' butonunu kullanarak izlemeyi istediğiniz zaman başlatabilir  veya 'Sil' butonunu kullanarak " +
    "aboneliklerizi silebilirsiniz."

  override val language = "Dil"
  override val chooseLanguageBtn =
    "Dilinizi Seçin"
  override def chooseLanguage(channelName: Option[String]) =
    header(channelName) + "Dilinizi Seçin:"
}
