package androidx.work;

import android.content.Context;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class WorkManagerInitializer implements D0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f11180a = q.i("WrkMgrInitializer");

    @Override // D0.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public B create(Context context) {
        q.e().a(f11180a, "Initializing WorkManager with default configuration.");
        B.i(context, new C1187b.C0180b().a());
        return B.h(context);
    }

    @Override // D0.a
    public List dependencies() {
        return Collections.EMPTY_LIST;
    }
}
