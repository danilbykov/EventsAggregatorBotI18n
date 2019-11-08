package io.events.aggregator.telegram.i18n

import io.events.aggregator.telegram.BaseMessages

trait EnglishMessages extends AbstractMessages with BaseMessages {

  override val noActiveSubscriptions =
    "Tidak ada langganan yang aktif. Gunakan perintah <pre>/add</pre> untuk menambah langganan"

  override def successfullySubscribed(twitter: String, channel: Option[String]) =
    channel match {
      case Some(name) =>
        s"Channel '${name}' telah berlangganan $twitter dengan sukses!"
      case None =>
        s"Berhasil berlangganan di $twitter!"
    }
  override def alreadySubscribed(twitter: String) = s"Akun $twitter telah dipantau"
  override val unknownError = "Terjadi kesalahan yang tidak dikenal :("
  override def accountNotExist(twitter: String) = s"Akun $twitter tidak ditemukan"
  override def tooManySubscriptions(max: Int) =
    s"Terlalu banyak langganan yang aktif. Hanya $max langganan setiap pengguna yang diizinkan."

  override def successfullyUnsubscribed(twitter: String) = s"Berhasil berhenti berlangganan dari $twitter!"
  override val notSubscribed = "Tidak dapat menemukan langganan ini!"

  override def chooseSource(channelName: Option[String]) =
    header(channelName) + "Silahkan pilih sumber:"
  override val chooseSubscriptionForRemoval = "Pilih langganan yang ingin dihapus:"
  override val noSubscriptions = "Tidak ada langganan yang aktif"

  override def greetMessage(username: String) =
    s"Halo $username! $botName Telah diaktifkan. Gunakan perintah /add Untuk berlanggan pada " +
    "Twitter, Reddit, YouTube atau RSS."
  override val helpText = """/add - Berlangganan pada semua tweets baru dari Twitter, Akun Instagram atau RSS feed
    |/addinstagram $account_name - Berlangganan pada semua foto baru dari akun Instagram
    |/addreddit $account_name - Berlangganan pada semua pembaruan baru dari SubReddit
    |/addrss $url - Berlangganan pada semua pembaruan dari RSS feed
    |/addtwitch $channel_name - Berlangganan pada semua video baru dari akun Twitch
    |/addtwitter $account_name - Berlangganan pada semua tweets baru dari akun Twitter
    |/addyoutube $channel_name - Berlangganan pada semua video baru dari channel YouTube
    |/list - Menampilkan semua daftar langganan yang aktif
    |/help - Menampilkan bantuan ini lagi ;)
    |/remove - Menghapus langganan yang aktif
    |/settings - Menyesuaikan bot Untuk chat anda:
    |  — Pilih bahasa yang anda diinginkan
    |  — Memilih templates yang diinginkan untuk berlangganan
    |  — Mengatur bot untuk channel Telegram anda
    |  — Mengatur wordfilter
    |  — Membatasi akses ke bot di dalam grup
    |  — Dan pengaturan lainnya""".stripMargin
  override val addUsageText = """Argument tidak valid. Penggunaan: <pre>/add $URL</pre> Dimana $URL adalah URL Twitter atau URL Instagram. Misalnya, gunakan
    |<pre>/add https://twitter.com/cristiano</pre> Untuk memantau akun Twitter atau
    |<pre>/add https://www.instagram.com/cristiano/</pre> Untuk memantau akun Instagram""".stripMargin
  override val enterTwitter = "Masukkan nama akun atau URL Twitter"
  override val addTwitterUsageText = """Argument tidak valid. Penggunaan: <pre>/addtwitter $account_name</pre> Contohnya, Anda bisa menggunakan salah satu format di bawah ini:
    |<pre>/addtwitter cristiano</pre> Atau
    |<pre>/addtwitter https://twitter.com/cristiano</pre>""".stripMargin
  override val enterInstagram = "Masukkan nama akun atau URL Instagram"
  override val addInstagramUsageText = """Argument tidak valid. Penggunaan: <pre>/addinstagram $account_name</pre> Contohnya, Anda bisa menggunakan salah satu format di bawah ini:
    |<pre>/addinstagram cristiano</pre> Atau
    |<pre>/addinstagram https://www.instagram.com/cristiano/</pre>""".stripMargin
  override val enterAtom = "Masukkan URL ke RSS feed atau URL ke halaman HTML dengan RSS"
  override val addAtomUsageText = """Argument tidak valid. Penggunaan: <pre>/addrss $account_name</pre> Contohnya, Anda bisa menggunakan salah satu format di bawah ini:
    |<pre>/addrss https://feedforall.com/sample.xml</pre>""".stripMargin
  override val enterReddit = "Bot bisa memantau postingan baru di SubReddit demikian juga dengan postingan users Reddit. Masukkan nama SubReddit atau Username/URL Reddit."
  override val addRedditUsageText = """Argument tidak valid. Penggunaan: <pre>/addreddit $subreddit</pre> Misalnya, Anda bisa menggunakan salah satu format di bawah ini:
    |<pre>/addreddit cristianoronaldo</pre> atau
    |<pre>/addreddit https://www.reddit.com/r/cristianoronaldo/</pre> Atau
    |<pre>/addreddit https://www.reddit.com/user/jdegoes</pre>""".stripMargin
  override val enterYouTubeText = "Masukkan teks untuk mencari channel Youtube."
  override val addYouTubeUsageText = """Argument tidak valid. Penggunaan: <pre>/addyoutube search_query</pre> Contohnya, Anda bisa menggunakan salah satu Perintah di bawah ini:
    |<pre>/addyoutube Cristiano Ronaldo</pre>""".stripMargin
  override val noYouTubeChannels = "Tidak ada channel YouTube yang ditemukan di pencarian anda"
  override val chooseYouTubeChannels = "Berikut ini beberapa channel yang ditemukan sesuai pencarian anda. Silahkan pilih channel untuk berlangganan:"
  override val enterTwitchText = "Masukkan nama channel atau URL Twitch"
  override val enterTwitchUsageText = """Argument tidak valid. Penggunaan: <pre>/addtwitch $channel_name</pre> Contohnya, Anda bisa menggunakan salah satu Perintah dibawah ini:
    |<pre>/addtwitch GSL</pre> atau
    |<pre>/addtwitch https://www.twitch.tv/gsl</pre>""".stripMargin

  override val noLink = "teks tidak ditemukan"
  override val backToBotSettingsButton = "<< Kembali ke pengaturan bot"

  override def botSettings(channelName: Option[String]) =
    header(channelName) + "Pengaturan bot:"

  override val onlyForAdmins = "Hanya Admin yang diizinkan untuk menjalankan perintah ini"
  override val permissionsButton = "Izin"
  override val restrictButton = "Batasan"
  override val disableRestrictionButton = "Matikan Batasan"
  override val unrestrictedMode = "Semua anggota di grup ini bisa menambahkan/menghapus langganan. Klik tombol di bawah ini untuk " +
    "Membatasi perintah ini dan diperlukan izin akses admin."
  override val restrictedMode = "Only administrators can add/remove subscriptions. Click button below to " +
    "provide access for all members of this group."
  override val noPermissions = "Hanya pengguna Admin yang bisa menjalankan aksi ini!"

  override val wordFilter = "filterkata"
  override val editWordfilterButton = "Edit filterkata"
  override val removeWordfilterButton = "Hapus filterkata"
  override def noStopWords(channelName: Option[String]) =
    header(channelName) +
      "Filterkata belum diatur. Gunakan filterkata untuk memfilter postingan yang keluar dimana mengandung" +
      "setidaknya satu kata dari filterkata."
  override def stopWords(stopWords: Set[String], channelName: Option[String]) =
    header(channelName) +
      "filterkata telah digunakan untuk memfilter postingan yang keluar dimana mengandung" +
      s"setidaknya satu kata dari filterkata.\n <b>Wordfilter: </b> ${stopWords.mkString(", ")}."
  override val enterStopWords =
    "Silakan masukkan filterkata yang dipisahkan oleh spasi. Tidak lebih dari 250 karakter diizinkan."
  override val tooLongStopList = "Pesan anda telah melebihi 250 karakter. Tidak lebih dari 250 karakter yang diizinkan."

  override val templatesButton = "Templates"
  override val backToTemplatesButton = "<< Kembali ke Templates"
  override val activeButton = "Aktif"
  override val activateButton = "Mengaktifkan"
  override val sendExampleButton = "Kirim contoh"
  override val sendImageButton = "Kirim gambar"
  override val sendVideoButton = "Kirim video"

  override def twitterTemplatesOverview(channelName: Option[String]) =
    header(channelName) + """Terdapat 4 templates yang tersedia:
      |1. mendekorasi link dengan pratinjau Tweet resmi. Ini digunakan secara default.
      |2. Link mentah dengan pratinjau Tweet resmi. link mentah terlihat "jelek" tapi Telegram client tidak meminta konfirmasi ketika Anda klik di linknya. Jadi ini menghemat satu kali klik.
      |3. Jika Tweet panjang maka teks dapat dipotong dalam pratinjau resmi. Template ini selalu menunjukkan teks lengkap.
      |4. template yang sama seperti template ketiga. Tapi link ke sumber Tweet dihiasi oleh teks 'Buka tweet'.""".stripMargin
  override def instagramTemplatesOverview(channelName: Option[String]) =
    header(channelName) + """Terdapat 4 templates yang tersedia:
      |1. mendekorasi link dengan pratinjau postingan instagram resmi. Ini digunakan secara default.
      |2. Link mentah dengan pratinjau postingan Instagram resmi. link mentah terlihat "jelek" tapi Telegram client tidak meminta konfirmasi ketika Anda klik di linknya. Jadi ini menghemat satu kali klik.
      |3. Jika postingan Instagram panjang maka teks dapat dipotong dalam pratinjau resmi. Template ini selalu menunjukkan teks lengkap. Ini bekerja juga dengan foto tunggal, video tapi postingan Instagram dengan gambar yang berganda tidak didukung. Hanya satu gambar saja yang diproses.
      |4. template yang sama seperti template ketiga. Tapi link ke sumber Tweet dihiasi oleh teks 'Buka di Instagram'.""".stripMargin
  override def redditTemplatesOverview(channelName: Option[String]) =
    header(channelName) + """Terdapat 3 template yang tersedia:
      |1. mendekorasi link dengan pratinjau postingan reddit resmi. Ini digunakan secara default.
      |2. Link mentah dengan pratinjau postingan reddit resmi. link mentah terlihat "jelek" tapi Telegram client tidak meminta konfirmasi ketika Anda klik di linknya. Jadi ini menghemat satu kali klik.
      |3. Mendekorasi link dengan tombol 'instant view'. Harap dicatat Instant Views tidak didukung di beberapa Telegram clients (misalnya, di browser) dan Instant View tidak bekerja jika postingan diblokir untuk komunitas 18+ .""".stripMargin
  override def youtubeTemplatesOverview(channelName: Option[String]) =
    header(channelName) + """Terdapat 2 templates yang tersedia:
      |1. mendekorasi link dengan pratinjau postingan YouTube resmi. Ini digunakan secara default.
      |2. Link mentah dengan pratinjau postingan Youtube resmi. link mentah terlihat "jelek" tapi Telegram client tidak meminta konfirmasi ketika Anda klik di linknya. Jadi ini menghemat satu kali klik.""".stripMargin

  override def retweetedByWithLink(url: String, author: String): String =
    s"""<a href="$url">di tweet ulang</a> oleh <b>$author</b>"""
  override def retweetedBy(author: String): String =
    s"""Di tweet ulang oleh <b>$author</b>"""
  override val openTweet = "Buka Tweet"
  override val slidesNote = "(*) Postingan ini memuat <b>multiple</b> foto. Klik link untuk melihat foto lainnya."
  override val openInInstagram = "Buka di Instagram"
  override val openInReddit = "Buka di Reddit"
  override val commentInSubreddit = "Beri komentar di Subreddit"
  override def videoScheduledOnYouTube(author: String, url: String) =
    s"""Pengguna <b>$author</b> telah menjadwalkan <a href="$url">video baru</a>"""
  override val readMore = "Baca lebih lanjut..."
  override def twitchVideo(user: String, url: String, directUrl: String) =
    s"""<b>$user</b> (Twitch Video)
      |Link Ke video: $url
      |Direct link ke video: $directUrl""".stripMargin
  override def twitchStream(user: String, url: String, directUrl: String, chatUrl: String) =
    s"""<b>$user</b> (Twitch Stream)
      |Link ke stream: $url
      |Direct link ke stream: $directUrl
      |Link ke chat: $chatUrl""".stripMargin

  override val forwardRetweetsButton = "Teruskan Retweets?"
  override val forwardRetweetsButton2 = "Teruskan Retweets"
  override val omitRetweetsButton = "Hilangkan Retweets"
  override def forwardRetweetsStateOverview(onlyTweets: Boolean, channelName: Option[String]) =
    if (onlyTweets) {
      header(channelName) +
        "Semua Retweets telah difilter. Hanya Tweets Yang telah diteruskan di Telegram. Klik tombol berikut untuk mengirim semuanya " +
        "Postingan dari Twitter termasuk Tweets and Retweets. Pengaturan ini tidak menimbulkan efek dengan layanan lain: " +
        "Instagram, Reddit, YouTube dan lebih banyak lagi."
    } else {
      header(channelName) +
        "Semua postingan Twitter (termasuk Tweets and Retweets) Telah diteruskan di Telegram. Klik tombol berikut" +
        "Untuk memfilter Retweets dan hanya mengirim Tweets. Pengaturan ini tidak menimbulkan efek dengan layanan lain: " +
        "Instagram, Reddit, YouTube dan lebih banyak lagi."
    }

  override val receiveNewFeatureButton = "ingin menerima pemberitahuan fitur baru?"
  override val turnOnNewFeatureButton = "Nyalakan Pemberitahuan fitur baru"
  override val turnOffNewFeatureButton = "Matikan Pemberitahuan fitur baru"
  override def sendFeaturesNotifications(send: Boolean, channelName: Option[String]) =
    if (send) {
      header(channelName) + s"Pemberitahuan fitur baru di $botName telah dinyalakan. Anda bisa Matikan pemberitahuan dengan menggunakan tombol berikut."
    } else {
      header(channelName) + s"Pemberitahuan fitur baru di $botName telah dimatikan. Anda bisa Nyalakan pemberitahuan baru " +
      """Menggunakan tombol berikut. Selain itu anda bisa follow <a href="https://twitter.com/EventsAggregat1">Akun Twitter ini</a>""" +
      " untuk memeriksa pembaruan terakhir."
    }

  override val bindWithChannelButton = "Sambungkan dengan channel Telegram"
  override val addNewChannelButton = "Tambah channel baru"
  override val unbindChannelButton = "putuskan Channel"
  override val removeButton = "Hapus"
  override val noChannelsBound = s"Tidak ada channel yang tersambung. Gunakan tombol berikut untuk menyambungkan $botName dengan channel anda."
  override val notBoundChannels = "Klik tombol berikut untuk menyambungkan channel dengan chat ini dan mengatur langganan anda di channel"
  override def channelBound(channelName: String) =
    s"Channel <b>${channelName}</b> telah tersambung dengan chat ini. Anda bisa memutuskan channel untuk menggunakan chat di mode regular " +
    "atau menyambungkan dengan channel lain untuk memperbarui langganan."
  override val addingChannel = s"Masukkan nama channel anda. Harap pastikan bahwa $botName telah ditambahkan sebagai " +
    "admin dan anda adalah pemilik channel tersebut."
  override def channelNotFound(channelName: String) =
    s"Channel '${channelName}' tidak ditemukan."
  override val notCreator = "Hanya pemilik channel yang bisa menyambungkan channel dengan obrolan chat."
  override val notAdmin = s"Bot $botName harus ditambahkan di channel anda sebagai Admin."
  override def channelExists(channelName: String) =
    s"Channel '${channelName}' Telah tersambung dengan obrolan ini."
  override val channelDoesNotExist = "Channel ini tidak ditemukan"
  override def channelDefined(channelName: String) =
    s"Channel '${channelName}' telah ditambahkan dengan sukses. Pilih channel ini dalam menu untuk mengatur langganan."
  override val channelDoesNotAlreadyExist =
    "Channel ini telah tidak tersedia. Harap Perbarui daftar channel."

  override val instagramBroken = "Instagram mencegah mendapatkan data dari halaman mereka. Pemantauan akun" +
    "Instagram telah dimatikan."

  override val resumeButton = "Lanjutkan"
  override val deleteButton = "Hapus"
  override val inactiveUser = "Anda tidak aktif dalam jangka waktu yang lama dan semua langganan telah dijeda. " +
    "Apakah anda masih ingin melanjutkan langganan ini?"
  override val monitoringResumed = "Pemantauan semua langganan anda telah dilanjutkan!"
  override val monitoringCancelled = "Semua langganan anda telah dihapus."
  override def tooLongInactive(daysLeft: Int) =
    "Harap konfirmasikan bahwa anda masih menggunakan bot ini. Anda bisa melakukannya dengan memasukkan perintah apapun " +
    s"(Misalnya, /help atau /list). Jika tidak Langganan anda akan dijeda dalam $daysLeft hari lagi."
  override val monitoringPaused =
    "Pemantauan langganan anda telah dijeda karena anda tidak aktif dalam jangka waktu yang lama. Anda " +
    "bisa memulai ulang pemantauan kapan saja menggunakan tombol 'Lanjutkan' atau menghapus langganan" +
    "dengan menggunakan tombol 'Hapus'."

  override val language = "Bahasa"
  override def chooseLanguage(channelName: Option[String]) =
    header(channelName) + "Silahkan pilih bahasa anda :):"
}

object EnglishMessages extends EnglishMessages
