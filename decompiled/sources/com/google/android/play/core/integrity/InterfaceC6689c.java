package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.Task;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC6689c {

    /* JADX INFO: renamed from: com.google.android.play.core.integrity.c$a */
    public static abstract class a {

        /* JADX INFO: renamed from: com.google.android.play.core.integrity.c$a$a, reason: collision with other inner class name */
        public static abstract class AbstractC0365a {
            public abstract a a();

            public abstract AbstractC0365a b(long j10);
        }

        public static AbstractC0365a c() {
            S s10 = new S();
            s10.c(0);
            return s10;
        }

        abstract int a();

        public abstract long b();
    }

    /* JADX INFO: renamed from: com.google.android.play.core.integrity.c$b */
    public static abstract class b {
        public abstract String a();
    }

    /* JADX INFO: renamed from: com.google.android.play.core.integrity.c$c, reason: collision with other inner class name */
    public interface InterfaceC0366c {
        Task a(d dVar);
    }

    /* JADX INFO: renamed from: com.google.android.play.core.integrity.c$d */
    public static abstract class d {

        /* JADX INFO: renamed from: com.google.android.play.core.integrity.c$d$a */
        public static abstract class a {
            public abstract d a();

            public abstract a b(String str);
        }

        public static a b() {
            return new U();
        }

        public abstract String a();
    }

    Task a(a aVar);
}
