package W5;

import android.content.Context;
import com.google.android.gms.internal.consent_sdk.zzct;
import com.google.android.gms.internal.consent_sdk.zzdb;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f6575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f6576b;

    /* JADX INFO: renamed from: W5.a$a, reason: collision with other inner class name */
    public static class C0109a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Context f6578b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f6580d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f6577a = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f6579c = 0;

        public C0109a(Context context) {
            this.f6578b = context.getApplicationContext();
        }

        public C0109a a(String str) {
            this.f6577a.add(str);
            return this;
        }

        public a b() {
            boolean z9 = true;
            if (!zzdb.zza(true) && !this.f6577a.contains(zzct.zza(this.f6578b)) && !this.f6580d) {
                z9 = false;
            }
            return new a(z9, this, null);
        }

        public C0109a c(int i10) {
            this.f6579c = i10;
            return this;
        }
    }

    /* synthetic */ a(boolean z9, C0109a c0109a, g gVar) {
        this.f6575a = z9;
        this.f6576b = c0109a.f6579c;
    }

    public int a() {
        return this.f6576b;
    }

    public boolean b() {
        return this.f6575a;
    }
}
