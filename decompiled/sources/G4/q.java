package G4;

import android.os.AsyncTask;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class q extends AsyncTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ s f976a;

    /* synthetic */ q(s sVar, byte[] bArr) {
        Objects.requireNonNull(sVar);
        this.f976a = sVar;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.f976a.A6();
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        s sVar = this.f976a;
        String str = (String) obj;
        if (sVar.D6() == null || str == null) {
            return;
        }
        sVar.D6().loadUrl(str);
    }
}
