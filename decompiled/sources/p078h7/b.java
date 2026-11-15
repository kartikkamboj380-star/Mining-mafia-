package p078h7;

import android.content.Context;
import android.os.Bundle;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.c;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f44798b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bundle f44799a;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public b(Context appContext) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Bundle bundle = appContext.getPackageManager().getApplicationInfo(appContext.getPackageName(), IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT).metaData;
        this.f44799a = bundle == null ? Bundle.EMPTY : bundle;
    }

    @Override // p078h7.o
    public Boolean a() {
        if (this.f44799a.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(this.f44799a.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    @Override // p078h7.o
    public kotlin.time.b b() {
        if (this.f44799a.containsKey("firebase_sessions_sessions_restart_timeout")) {
            return kotlin.time.b.h(c.p(this.f44799a.getInt("firebase_sessions_sessions_restart_timeout"), H8.b.SECONDS));
        }
        return null;
    }

    @Override // p078h7.o
    public Double c() {
        if (this.f44799a.containsKey("firebase_sessions_sampling_rate")) {
            return Double.valueOf(this.f44799a.getDouble("firebase_sessions_sampling_rate"));
        }
        return null;
    }

    @Override // p078h7.o
    public Object d(p169q8.b bVar) {
        return o.a.a(this, bVar);
    }
}
