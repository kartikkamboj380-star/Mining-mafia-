package O5;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
final class k implements Q5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f4524a;

    k(l lVar, Activity activity) {
        this.f4524a = activity;
    }

    @Override // Q5.a
    public final void a(IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) throws IntentSender.SendIntentException {
        this.f4524a.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
    }
}
