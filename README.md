# IrishTunesApp

Application Android pour apprendre les tunes irlandais.

Basée sur le web app [irish-tunes-tutor](https://github.com/0urx/irish-tunes-tutor), embarquée dans une WebView.

## Build

Un workflow GitHub Actions (`.github/workflows/build-apk.yml`) compile l'APK debug à chaque push.
L'APK est disponible en téléchargement dans l'onglet **Actions** du run, sous l'artefact `irish-tunes-debug-apk`.

Build local :

```bash
./gradlew assembleDebug
# APK : app/build/outputs/apk/debug/app-debug.apk
```

## Licence

PolyForm Noncommercial 1.0.0 — Usage non commercial uniquement. Toute copie ou réutilisation doit citer l'auteur « 0urx ».
