package androidx.core.app;

import android.app.RemoteInput;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f9283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CharSequence f9284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CharSequence[] f9285c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f9286d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f9287e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Bundle f9288f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Set f9289g;

    static class a {
        public static RemoteInput a(x xVar) {
            Set setD;
            RemoteInput.Builder builderAddExtras = new RemoteInput.Builder(xVar.i()).setLabel(xVar.h()).setChoices(xVar.e()).setAllowFreeFormInput(xVar.c()).addExtras(xVar.g());
            if (Build.VERSION.SDK_INT >= 26 && (setD = xVar.d()) != null) {
                Iterator it = setD.iterator();
                while (it.hasNext()) {
                    b.a(builderAddExtras, (String) it.next(), true);
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                c.a(builderAddExtras, xVar.f());
            }
            return builderAddExtras.build();
        }

        static Bundle b(Intent intent) {
            return RemoteInput.getResultsFromIntent(intent);
        }
    }

    static class b {
        static RemoteInput.Builder a(RemoteInput.Builder builder, String str, boolean z9) {
            return builder.setAllowDataType(str, z9);
        }
    }

    static class c {
        static RemoteInput.Builder a(RemoteInput.Builder builder, int i10) {
            return builder.setEditChoicesBeforeSending(i10);
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f9290a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private CharSequence f9293d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private CharSequence[] f9294e;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Set f9291b = new HashSet();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Bundle f9292c = new Bundle();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f9295f = true;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f9296g = 0;

        public d(String str) {
            if (str == null) {
                throw new IllegalArgumentException("Result key can't be null");
            }
            this.f9290a = str;
        }

        public x a() {
            return new x(this.f9290a, this.f9293d, this.f9294e, this.f9295f, this.f9296g, this.f9292c, this.f9291b);
        }

        public d b(boolean z9) {
            this.f9295f = z9;
            return this;
        }

        public d c(CharSequence[] charSequenceArr) {
            this.f9294e = charSequenceArr;
            return this;
        }

        public d d(int i10) {
            this.f9296g = i10;
            return this;
        }

        public d e(CharSequence charSequence) {
            this.f9293d = charSequence;
            return this;
        }
    }

    x(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z9, int i10, Bundle bundle, Set set) {
        this.f9283a = str;
        this.f9284b = charSequence;
        this.f9285c = charSequenceArr;
        this.f9286d = z9;
        this.f9287e = i10;
        this.f9288f = bundle;
        this.f9289g = set;
        if (f() == 2 && !c()) {
            throw new IllegalArgumentException("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        }
    }

    static RemoteInput a(x xVar) {
        return a.a(xVar);
    }

    static RemoteInput[] b(x[] xVarArr) {
        if (xVarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[xVarArr.length];
        for (int i10 = 0; i10 < xVarArr.length; i10++) {
            remoteInputArr[i10] = a(xVarArr[i10]);
        }
        return remoteInputArr;
    }

    public static Bundle j(Intent intent) {
        return a.b(intent);
    }

    public boolean c() {
        return this.f9286d;
    }

    public Set d() {
        return this.f9289g;
    }

    public CharSequence[] e() {
        return this.f9285c;
    }

    public int f() {
        return this.f9287e;
    }

    public Bundle g() {
        return this.f9288f;
    }

    public CharSequence h() {
        return this.f9284b;
    }

    public String i() {
        return this.f9283a;
    }

    public boolean k() {
        if (c()) {
            return false;
        }
        return ((e() != null && e().length != 0) || d() == null || d().isEmpty()) ? false : true;
    }
}
