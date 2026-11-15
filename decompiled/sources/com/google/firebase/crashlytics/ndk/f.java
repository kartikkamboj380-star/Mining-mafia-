package com.google.firebase.crashlytics.ndk;

import java.io.File;
import p147o6.F;

/* JADX INFO: loaded from: classes3.dex */
final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f40069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f40070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f40071c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final File f40072d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final File f40073e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final File f40074f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final File f40075g;

    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private c f40076a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private File f40077b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private File f40078c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private File f40079d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private File f40080e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private File f40081f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private File f40082g;

        b() {
        }

        b h(File file) {
            this.f40080e = file;
            return this;
        }

        f i() {
            return new f(this);
        }

        b j(File file) {
            this.f40081f = file;
            return this;
        }

        b k(File file) {
            this.f40078c = file;
            return this;
        }

        b l(c cVar) {
            this.f40076a = cVar;
            return this;
        }

        b m(File file) {
            this.f40082g = file;
            return this;
        }

        b n(File file) {
            this.f40079d = file;
            return this;
        }
    }

    static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final File f40083a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final F.a f40084b;

        c(File file, F.a aVar) {
            this.f40083a = file;
            this.f40084b = aVar;
        }

        boolean a() {
            File file = this.f40083a;
            return (file != null && file.exists()) || this.f40084b != null;
        }
    }

    private f(b bVar) {
        this.f40069a = bVar.f40076a;
        this.f40070b = bVar.f40077b;
        this.f40071c = bVar.f40078c;
        this.f40072d = bVar.f40079d;
        this.f40073e = bVar.f40080e;
        this.f40074f = bVar.f40081f;
        this.f40075g = bVar.f40082g;
    }
}
