package androidx.room;

import android.content.Context;
import android.content.Intent;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f10808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final A0.h.c f10810c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u.e f10811d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f10812e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f10813f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u.d f10814g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Executor f10815h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Executor f10816i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Intent f10817j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f10818k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f10819l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Set f10820m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f10821n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final File f10822o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Callable f10823p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final List f10824q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List f10825r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f10826s;

    public f(Context context, String str, A0.h.c sqliteOpenHelperFactory, u.e migrationContainer, List list, boolean z9, u.d journalMode, Executor queryExecutor, Executor transactionExecutor, Intent intent, boolean z10, boolean z11, Set set, String str2, File file, Callable callable, u.f fVar, List typeConverters, List autoMigrationSpecs) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        Intrinsics.checkNotNullParameter(migrationContainer, "migrationContainer");
        Intrinsics.checkNotNullParameter(journalMode, "journalMode");
        Intrinsics.checkNotNullParameter(queryExecutor, "queryExecutor");
        Intrinsics.checkNotNullParameter(transactionExecutor, "transactionExecutor");
        Intrinsics.checkNotNullParameter(typeConverters, "typeConverters");
        Intrinsics.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
        this.f10808a = context;
        this.f10809b = str;
        this.f10810c = sqliteOpenHelperFactory;
        this.f10811d = migrationContainer;
        this.f10812e = list;
        this.f10813f = z9;
        this.f10814g = journalMode;
        this.f10815h = queryExecutor;
        this.f10816i = transactionExecutor;
        this.f10817j = intent;
        this.f10818k = z10;
        this.f10819l = z11;
        this.f10820m = set;
        this.f10821n = str2;
        this.f10822o = file;
        this.f10823p = callable;
        this.f10824q = typeConverters;
        this.f10825r = autoMigrationSpecs;
        this.f10826s = intent != null;
    }

    public boolean a(int i10, int i11) {
        Set set;
        return (i10 <= i11 || !this.f10819l) && this.f10818k && ((set = this.f10820m) == null || !set.contains(Integer.valueOf(i10)));
    }
}
