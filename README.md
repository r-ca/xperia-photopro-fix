# xperia-photopro-fix
## 概要
- カスタムROM環境などにインストールしたPhotoProがクラッシュして起動出来ない問題を修正します

## 詳細
- `com.sonyericsson.idd.api.Idd.addEvent()`を呼び出した際に未定義例外が発生するため、それを呼び出している`com.sonymobile.photopro.idd.core.IddManager.addAppData()`を強制的に置き換えます

## 動作確認
- Xperia5 Mark3 A103SO
  - Vendor: SOG05(61.2.D.0.81)
  - ROM: LineageOS20
  
## その他
- 問題が発生した場合は予告なく削除する場合があります