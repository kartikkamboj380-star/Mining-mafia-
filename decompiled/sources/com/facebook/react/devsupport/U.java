package com.facebook.react.devsupport;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.EditText;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class U {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f14648b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f14649a;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(U u10) {
        u10.f14649a = false;
    }

    public final boolean b(int i10, View view) {
        if (i10 == 46 && !(view instanceof EditText)) {
            if (this.f14649a) {
                this.f14649a = false;
                return true;
            }
            this.f14649a = true;
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.facebook.react.devsupport.T
                @Override // java.lang.Runnable
                public final void run() {
                    U.c(this.f14647a);
                }
            }, 200L);
        }
        return false;
    }
}
