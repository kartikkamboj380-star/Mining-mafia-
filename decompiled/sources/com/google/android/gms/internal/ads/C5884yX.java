package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.RemoteException;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.yX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5884yX extends AbstractC2190Oi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f35367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceExecutorServiceC1805Gx0 f35368b;

    public C5884yX(Context context, InterfaceExecutorServiceC1805Gx0 interfaceExecutorServiceC1805Gx0) {
        super(context, "AdMobOfflineBufferedPings.db", null, ((Integer) H4.B.c().d(AbstractC3892ii.I9)).intValue(), AbstractC2294Qi0.f22432a);
        this.f35367a = context;
        this.f35368b = interfaceExecutorServiceC1805Gx0;
    }

    static final void G(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{str, Integer.toString(0)});
    }

    private static void J(SQLiteDatabase sQLiteDatabase, L4.v vVar) throws Throwable {
        SQLiteDatabase sQLiteDatabase2;
        String string;
        sQLiteDatabase.beginTransaction();
        try {
            String[] strArr = {"timestamp", "url"};
            StringBuilder sb = new StringBuilder(15);
            sb.append("event_state = ");
            sb.append(1);
            String string2 = sb.toString();
            sQLiteDatabase2 = sQLiteDatabase;
            try {
                Cursor cursorQuery = sQLiteDatabase2.query("offline_buffered_pings", strArr, string2, null, null, null, "timestamp ASC", null);
                int count = cursorQuery.getCount();
                String[] strArr2 = new String[count];
                int i10 = 0;
                while (cursorQuery.moveToNext()) {
                    int columnIndex = cursorQuery.getColumnIndex("timestamp");
                    int columnIndex2 = cursorQuery.getColumnIndex("url");
                    if (columnIndex2 != -1) {
                        long j10 = cursorQuery.getLong(columnIndex);
                        String string3 = cursorQuery.getString(columnIndex2);
                        if (string3 == null) {
                            string = "";
                        } else {
                            Uri uri = Uri.parse(string3);
                            long jCurrentTimeMillis = G4.t.o().currentTimeMillis() - j10;
                            String encodedQuery = uri.getEncodedQuery();
                            Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
                            builderClearQuery.appendQueryParameter("bd", Long.toString(jCurrentTimeMillis));
                            String strValueOf = String.valueOf(builderClearQuery.build());
                            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 1 + String.valueOf(encodedQuery).length());
                            sb2.append(strValueOf);
                            sb2.append("&");
                            sb2.append(encodedQuery);
                            string = sb2.toString();
                        }
                        strArr2[i10] = string;
                    }
                    i10++;
                }
                cursorQuery.close();
                sQLiteDatabase2.delete("offline_buffered_pings", "event_state = ?", new String[]{Integer.toString(1)});
                sQLiteDatabase2.setTransactionSuccessful();
                sQLiteDatabase2.endTransaction();
                for (int i11 = 0; i11 < count; i11++) {
                    vVar.b(strArr2[i11], null);
                }
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                sQLiteDatabase2.endTransaction();
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
            sQLiteDatabase2 = sQLiteDatabase;
        }
    }

    static /* synthetic */ Void v(L4.v vVar, SQLiteDatabase sQLiteDatabase) throws Throwable {
        J(sQLiteDatabase, vVar);
        return null;
    }

    static /* synthetic */ void w(SQLiteDatabase sQLiteDatabase, String str, L4.v vVar) throws Throwable {
        ContentValues contentValues = new ContentValues();
        contentValues.put("event_state", (Integer) 1);
        sQLiteDatabase.update("offline_buffered_pings", contentValues, "gws_query_id = ?", new String[]{str});
        J(sQLiteDatabase, vVar);
    }

    final void a(InterfaceC4386md0 interfaceC4386md0) {
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.ads.xX
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.f34913a.getWritableDatabase();
            }
        };
        InterfaceExecutorServiceC1805Gx0 interfaceExecutorServiceC1805Gx0 = this.f35368b;
        AbstractC5685wx0.r(interfaceExecutorServiceC1805Gx0.e0(callable), new C5002rX(this, interfaceC4386md0), interfaceExecutorServiceC1805Gx0);
    }

    final void c(final SQLiteDatabase sQLiteDatabase, final L4.v vVar, final String str) {
        this.f35368b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.sX
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() throws Throwable {
                C5884yX.w(sQLiteDatabase, str, vVar);
            }
        });
    }

    public final void h(final L4.v vVar, final String str) {
        a(new InterfaceC4386md0() { // from class: com.google.android.gms.internal.ads.tX
            @Override // com.google.android.gms.internal.ads.InterfaceC4386md0
            public final /* synthetic */ Object zza(Object obj) {
                this.f33422a.c((SQLiteDatabase) obj, vVar, str);
                return null;
            }
        });
    }

    public final void j(final String str) {
        a(new InterfaceC4386md0(this) { // from class: com.google.android.gms.internal.ads.uX
            @Override // com.google.android.gms.internal.ads.InterfaceC4386md0
            public final /* synthetic */ Object zza(Object obj) {
                C5884yX.G((SQLiteDatabase) obj, str);
                return null;
            }
        });
    }

    public final void n(final AX ax) {
        a(new InterfaceC4386md0() { // from class: com.google.android.gms.internal.ads.vX
            @Override // com.google.android.gms.internal.ads.InterfaceC4386md0
            public final /* synthetic */ Object zza(Object obj) {
                this.f34094a.x(ax, (SQLiteDatabase) obj);
                return null;
            }
        });
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE offline_buffered_pings (timestamp INTEGER PRIMARY_KEY, gws_query_id TEXT, url TEXT, event_state INTEGER)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    final /* synthetic */ Void x(AX ax, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(ax.f17356a));
        contentValues.put("gws_query_id", ax.f17357b);
        contentValues.put("url", ax.f17358c);
        contentValues.put("event_state", Integer.valueOf(ax.f17359d - 1));
        sQLiteDatabase.insert("offline_buffered_pings", null, contentValues);
        G4.t.g();
        Context context = this.f35367a;
        K4.Q qE = K4.F0.e(context);
        if (qE != null) {
            try {
                qE.zzf(com.google.android.gms.dynamic.b.N0(context));
            } catch (RemoteException e10) {
                AbstractC0786o0.l("Failed to schedule offline ping sender.", e10);
            }
        }
        return null;
    }
}
