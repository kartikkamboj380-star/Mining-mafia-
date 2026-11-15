package com.facebook.react.common.mapbuffer;

import kotlin.enums.EnumEntries;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes.dex */
public interface a extends Iterable, A8.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C0332a f14549t = C0332a.f14550a;

    /* JADX INFO: renamed from: com.facebook.react.common.mapbuffer.a$a, reason: collision with other inner class name */
    public static final class C0332a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ C0332a f14550a = new C0332a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final IntRange f14551b = new IntRange(0, 65535);

        private C0332a() {
        }

        public final IntRange a() {
            return f14551b;
        }
    }

    public enum b {
        BOOL,
        INT,
        DOUBLE,
        STRING,
        MAP,
        LONG;


        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f14559h = p189s8.a.a(c());
    }

    public interface c {
        long a();

        a b();

        boolean c();

        double getDoubleValue();

        int getIntValue();

        int getKey();

        String getStringValue();

        b getType();
    }

    a M(int i10);

    boolean R(int i10);

    boolean getBoolean(int i10);

    int getCount();

    double getDouble(int i10);

    int getInt(int i10);

    String getString(int i10);
}
