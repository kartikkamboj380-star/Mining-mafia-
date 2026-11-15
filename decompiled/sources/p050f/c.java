package p050f;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class c extends p050f.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f43527a = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Override // p050f.a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent a(Context context, Intent input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        return input;
    }

    @Override // p050f.a
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public p040e.a c(int i10, Intent intent) {
        return new p040e.a(i10, intent);
    }
}
