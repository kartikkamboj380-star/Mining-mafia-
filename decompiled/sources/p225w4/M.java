package p225w4;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.inject.Provider;
import p145o4.h;
import p145o4.i;
import p145o4.p;
import p175r4.e;
import p175r4.f;

/* JADX INFO: loaded from: classes2.dex */
public class M implements InterfaceC7144d, p235x4.b, InterfaceC7143c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final p125m4.c f50287f = p125m4.c.b("proto");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final W f50288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p245y4.a f50289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p245y4.a f50290c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AbstractC7145e f50291d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f50292e;

    interface b {
        Object apply(Object obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f50293a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final String f50294b;

        private c(String str, String str2) {
            this.f50293a = str;
            this.f50294b = str2;
        }
    }

    interface d {
        Object a();
    }

    M(p245y4.a aVar, p245y4.a aVar2, AbstractC7145e abstractC7145e, W w10, Provider provider) {
        this.f50288a = w10;
        this.f50289b = aVar;
        this.f50290c = aVar2;
        this.f50291d = abstractC7145e;
        this.f50292e = provider;
    }

    private boolean B1() {
        return w1() * x1() >= this.f50291d.f();
    }

    private List C1(List list, Map map) {
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            AbstractC7151k abstractC7151k = (AbstractC7151k) listIterator.next();
            if (map.containsKey(Long.valueOf(abstractC7151k.c()))) {
                i.a aVarP = abstractC7151k.b().p();
                for (c cVar : (Set) map.get(Long.valueOf(abstractC7151k.c()))) {
                    aVarP.c(cVar.f50293a, cVar.f50294b);
                }
                listIterator.set(AbstractC7151k.a(abstractC7151k.c(), abstractC7151k.d(), aVarP.d()));
            }
        }
        return list;
    }

    private List D1(SQLiteDatabase sQLiteDatabase, final p pVar, int i10) {
        final ArrayList arrayList = new ArrayList();
        Long lZ1 = z1(sQLiteDatabase, pVar);
        if (lZ1 == null) {
            return arrayList;
        }
        L1(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline", "product_id", "pseudonymous_id", "experiment_ids_clear_blob", "experiment_ids_encrypted_blob"}, "context_id = ?", new String[]{lZ1.toString()}, null, null, null, String.valueOf(i10)), new b() { // from class: w4.x
            @Override // w4.M.b
            public final Object apply(Object obj) {
                return M.l1(this.f50350a, arrayList, pVar, (Cursor) obj);
            }
        });
        return arrayList;
    }

    private Map E1(SQLiteDatabase sQLiteDatabase, List list) {
        final HashMap map = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i10 = 0; i10 < list.size(); i10++) {
            sb.append(((AbstractC7151k) list.get(i10)).c());
            if (i10 < list.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        L1(sQLiteDatabase.query("event_metadata", new String[]{"event_id", MediationMetaData.KEY_NAME, "value"}, sb.toString(), null, null, null, null), new b() { // from class: w4.z
            @Override // w4.M.b
            public final Object apply(Object obj) {
                return M.V0(map, (Cursor) obj);
            }
        });
        return map;
    }

    private static byte[] F1(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    public static /* synthetic */ SQLiteDatabase G(Throwable th) {
        throw new p235x4.a("Timed out while trying to open db.", th);
    }

    private void G1(p175r4.a.C0524a c0524a, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            c0524a.a(p175r4.d.c().c((String) entry.getKey()).b((List) entry.getValue()).a());
        }
    }

    private byte[] H1(long j10) {
        return (byte[]) L1(u1().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j10)}, null, null, "sequence_num"), new b() { // from class: w4.B
            @Override // w4.M.b
            public final Object apply(Object obj) {
                return M.R((Cursor) obj);
            }
        });
    }

    public static /* synthetic */ Object I0(Throwable th) {
        throw new p235x4.a("Timed out while trying to acquire the lock.", th);
    }

    private Object I1(d dVar, b bVar) {
        long jA = this.f50290c.a();
        while (true) {
            try {
                return dVar.a();
            } catch (SQLiteDatabaseLockedException e10) {
                if (this.f50290c.a() >= ((long) this.f50291d.b()) + jA) {
                    return bVar.apply(e10);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    public static /* synthetic */ Object J(M m10, Cursor cursor) {
        m10.getClass();
        while (cursor.moveToNext()) {
            m10.h(cursor.getInt(0), r4.c.b.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    private static p125m4.c J1(String str) {
        return str == null ? f50287f : p125m4.c.b(str);
    }

    private static String K1(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((AbstractC7151k) it.next()).c());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    static Object L1(Cursor cursor, b bVar) {
        try {
            return bVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public static /* synthetic */ Object M(final M m10, String str, String str2, SQLiteDatabase sQLiteDatabase) {
        m10.getClass();
        sQLiteDatabase.compileStatement(str).execute();
        L1(sQLiteDatabase.rawQuery(str2, null), new b() { // from class: w4.v
            @Override // w4.M.b
            public final Object apply(Object obj) {
                return M.x(this.f50349a, (Cursor) obj);
            }
        });
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    public static /* synthetic */ Boolean N(M m10, p pVar, SQLiteDatabase sQLiteDatabase) {
        Long lZ1 = m10.z1(sQLiteDatabase, pVar);
        return lZ1 == null ? Boolean.FALSE : (Boolean) L1(m10.u1().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lZ1.toString()}), new b() { // from class: w4.u
            @Override // w4.M.b
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            }
        });
    }

    public static /* synthetic */ Object Q(long j10, p pVar, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j10));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{pVar.b(), String.valueOf(p255z4.a.a(pVar.d()))}) < 1) {
            contentValues.put("backend_name", pVar.b());
            contentValues.put(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, Integer.valueOf(p255z4.a.a(pVar.d())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    public static /* synthetic */ byte[] R(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int length = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            length += blob.length;
        }
        byte[] bArr = new byte[length];
        int length2 = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            byte[] bArr2 = (byte[]) arrayList.get(i10);
            System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
            length2 += bArr2.length;
        }
        return bArr;
    }

    public static /* synthetic */ Object R0(String str, r4.c.b bVar, long j10, SQLiteDatabase sQLiteDatabase) {
        if (((Boolean) L1(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.getNumber())}), new b() { // from class: w4.y
            @Override // w4.M.b
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Cursor) obj).getCount() > 0);
            }
        })).booleanValue()) {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j10 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.getNumber())});
            return null;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("log_source", str);
        contentValues.put("reason", Integer.valueOf(bVar.getNumber()));
        contentValues.put("events_dropped_count", Long.valueOf(j10));
        sQLiteDatabase.insert("log_event_dropped", null, contentValues);
        return null;
    }

    public static /* synthetic */ List S(SQLiteDatabase sQLiteDatabase) {
        return (List) L1(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new b() { // from class: w4.K
            @Override // w4.M.b
            public final Object apply(Object obj) {
                return M.w((Cursor) obj);
            }
        });
    }

    public static /* synthetic */ p175r4.a T(M m10, Map map, p175r4.a.C0524a c0524a, Cursor cursor) {
        m10.getClass();
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            r4.c.b bVarQ1 = m10.q1(cursor.getInt(1));
            long j10 = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(p175r4.c.c().c(bVarQ1).b(j10).a());
        }
        m10.G1(c0524a, map);
        return c0524a.e(m10.y1()).d(m10.v1()).c((String) m10.f50292e.get()).b();
    }

    public static /* synthetic */ Object V0(Map map, Cursor cursor) {
        while (true) {
            if (!cursor.moveToNext()) {
                return null;
            }
            long j10 = cursor.getLong(0);
            Set hashSet = (Set) map.get(Long.valueOf(j10));
            if (hashSet == null) {
                hashSet = new HashSet();
                map.put(Long.valueOf(j10), hashSet);
            }
            hashSet.add(new c(cursor.getString(1), cursor.getString(2)));
        }
    }

    public static /* synthetic */ Long W(M m10, i iVar, p pVar, SQLiteDatabase sQLiteDatabase) {
        if (m10.B1()) {
            m10.h(1L, r4.c.b.CACHE_FULL, iVar.n());
            return -1L;
        }
        long jS1 = m10.s1(sQLiteDatabase, pVar);
        int iE = m10.f50291d.e();
        byte[] bArrA = iVar.e().a();
        boolean z9 = bArrA.length <= iE;
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(jS1));
        contentValues.put("transport_name", iVar.n());
        contentValues.put("timestamp_ms", Long.valueOf(iVar.f()));
        contentValues.put("uptime_ms", Long.valueOf(iVar.o()));
        contentValues.put("payload_encoding", iVar.e().b().a());
        contentValues.put("code", iVar.d());
        contentValues.put("num_attempts", (Integer) 0);
        contentValues.put("inline", Boolean.valueOf(z9));
        contentValues.put("payload", z9 ? bArrA : new byte[0]);
        contentValues.put("product_id", iVar.l());
        contentValues.put("pseudonymous_id", iVar.m());
        contentValues.put("experiment_ids_clear_blob", iVar.g());
        contentValues.put("experiment_ids_encrypted_blob", iVar.h());
        long jInsert = sQLiteDatabase.insert("events", null, contentValues);
        if (!z9) {
            int iCeil = (int) Math.ceil(((double) bArrA.length) / ((double) iE));
            for (int i10 = 1; i10 <= iCeil; i10++) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrA, (i10 - 1) * iE, Math.min(i10 * iE, bArrA.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(jInsert));
                contentValues2.put("sequence_num", Integer.valueOf(i10));
                contentValues2.put("bytes", bArrCopyOfRange);
                sQLiteDatabase.insert("event_payloads", null, contentValues2);
            }
        }
        for (Map.Entry entry : iVar.k().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(jInsert));
            contentValues3.put(MediationMetaData.KEY_NAME, (String) entry.getKey());
            contentValues3.put("value", (String) entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues3);
        }
        return Long.valueOf(jInsert);
    }

    public static /* synthetic */ Object X(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        return null;
    }

    public static /* synthetic */ Long a0(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return null;
    }

    public static /* synthetic */ Integer g1(final M m10, long j10, SQLiteDatabase sQLiteDatabase) {
        m10.getClass();
        String[] strArr = {String.valueOf(j10)};
        L1(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new b() { // from class: w4.s
            @Override // w4.M.b
            public final Object apply(Object obj) {
                return M.J(this.f50344a, (Cursor) obj);
            }
        });
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }

    public static /* synthetic */ Object l1(M m10, List list, p pVar, Cursor cursor) {
        m10.getClass();
        while (cursor.moveToNext()) {
            long j10 = cursor.getLong(0);
            boolean z9 = cursor.getInt(7) != 0;
            i.a aVarO = i.a().n(cursor.getString(1)).i(cursor.getLong(2)).o(cursor.getLong(3));
            if (z9) {
                aVarO.h(new h(J1(cursor.getString(4)), cursor.getBlob(5)));
            } else {
                aVarO.h(new h(J1(cursor.getString(4)), m10.H1(j10)));
            }
            if (!cursor.isNull(6)) {
                aVarO.g(Integer.valueOf(cursor.getInt(6)));
            }
            if (!cursor.isNull(8)) {
                aVarO.l(Integer.valueOf(cursor.getInt(8)));
            }
            if (!cursor.isNull(9)) {
                aVarO.m(cursor.getString(9));
            }
            if (!cursor.isNull(10)) {
                aVarO.j(cursor.getBlob(10));
            }
            if (!cursor.isNull(11)) {
                aVarO.k(cursor.getBlob(11));
            }
            list.add(AbstractC7151k.a(j10, pVar, aVarO.d()));
        }
        return null;
    }

    public static /* synthetic */ Object m1(M m10, SQLiteDatabase sQLiteDatabase) {
        m10.getClass();
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + m10.f50289b.a()).execute();
        return null;
    }

    public static /* synthetic */ f n(long j10, Cursor cursor) {
        cursor.moveToNext();
        return f.c().c(cursor.getLong(0)).b(j10).a();
    }

    public static /* synthetic */ p175r4.a n1(final M m10, String str, final Map map, final p175r4.a.C0524a c0524a, SQLiteDatabase sQLiteDatabase) {
        m10.getClass();
        return (p175r4.a) L1(sQLiteDatabase.rawQuery(str, new String[0]), new b() { // from class: w4.A
            @Override // w4.M.b
            public final Object apply(Object obj) {
                return M.T(this.f50273a, map, c0524a, (Cursor) obj);
            }
        });
    }

    public static /* synthetic */ Long o1(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }

    public static /* synthetic */ f p1(final long j10, SQLiteDatabase sQLiteDatabase) {
        return (f) L1(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new b() { // from class: w4.D
            @Override // w4.M.b
            public final Object apply(Object obj) {
                return M.n(j10, (Cursor) obj);
            }
        });
    }

    private r4.c.b q1(int i10) {
        r4.c.b bVar = r4.c.b.REASON_UNKNOWN;
        if (i10 == bVar.getNumber()) {
            return bVar;
        }
        r4.c.b bVar2 = r4.c.b.MESSAGE_TOO_OLD;
        if (i10 == bVar2.getNumber()) {
            return bVar2;
        }
        r4.c.b bVar3 = r4.c.b.CACHE_FULL;
        if (i10 == bVar3.getNumber()) {
            return bVar3;
        }
        r4.c.b bVar4 = r4.c.b.PAYLOAD_TOO_BIG;
        if (i10 == bVar4.getNumber()) {
            return bVar4;
        }
        r4.c.b bVar5 = r4.c.b.MAX_RETRIES_REACHED;
        if (i10 == bVar5.getNumber()) {
            return bVar5;
        }
        r4.c.b bVar6 = r4.c.b.INVALID_PAYLOD;
        if (i10 == bVar6.getNumber()) {
            return bVar6;
        }
        r4.c.b bVar7 = r4.c.b.SERVER_ERROR;
        if (i10 == bVar7.getNumber()) {
            return bVar7;
        }
        p185s4.a.b("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i10));
        return bVar;
    }

    private void r1(final SQLiteDatabase sQLiteDatabase) {
        I1(new d() { // from class: w4.l
            @Override // w4.M.d
            public final Object a() {
                return M.X(sQLiteDatabase);
            }
        }, new b() { // from class: w4.w
            @Override // w4.M.b
            public final Object apply(Object obj) {
                return M.I0((Throwable) obj);
            }
        });
    }

    private long s1(SQLiteDatabase sQLiteDatabase, p pVar) {
        Long lZ1 = z1(sQLiteDatabase, pVar);
        if (lZ1 != null) {
            return lZ1.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", pVar.b());
        contentValues.put(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, Integer.valueOf(p255z4.a.a(pVar.d())));
        contentValues.put("next_request_ms", (Integer) 0);
        if (pVar.c() != null) {
            contentValues.put(HandleInvocationsFromAdViewer.KEY_EXTRAS, Base64.encodeToString(pVar.c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", null, contentValues);
    }

    public static /* synthetic */ List v(M m10, p pVar, SQLiteDatabase sQLiteDatabase) {
        List listD1 = m10.D1(sQLiteDatabase, pVar, m10.f50291d.d());
        for (p125m4.f fVar : p125m4.f.values()) {
            if (fVar != pVar.d()) {
                int iD = m10.f50291d.d() - listD1.size();
                if (iD <= 0) {
                    break;
                }
                listD1.addAll(m10.D1(sQLiteDatabase, pVar.f(fVar), iD));
            }
        }
        return m10.C1(listD1, m10.E1(sQLiteDatabase, listD1));
    }

    private p175r4.b v1() {
        return p175r4.b.b().b(e.c().b(t1()).c(AbstractC7145e.f50328a.f()).a()).a();
    }

    public static /* synthetic */ List w(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(p.a().b(cursor.getString(1)).d(p255z4.a.b(cursor.getInt(2))).c(F1(cursor.getString(3))).a());
        }
        return arrayList;
    }

    private long w1() {
        return u1().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    public static /* synthetic */ Object x(M m10, Cursor cursor) {
        m10.getClass();
        while (cursor.moveToNext()) {
            m10.h(cursor.getInt(0), r4.c.b.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    private long x1() {
        return u1().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    private f y1() {
        final long jA = this.f50289b.a();
        return (f) A1(new b() { // from class: w4.C
            @Override // w4.M.b
            public final Object apply(Object obj) {
                return M.p1(jA, (SQLiteDatabase) obj);
            }
        });
    }

    private Long z1(SQLiteDatabase sQLiteDatabase, p pVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(pVar.b(), String.valueOf(p255z4.a.a(pVar.d()))));
        if (pVar.c() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(pVar.c(), 0));
        } else {
            sb.append(" and extras is null");
        }
        return (Long) L1(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new b() { // from class: w4.n
            @Override // w4.M.b
            public final Object apply(Object obj) {
                return M.a0((Cursor) obj);
            }
        });
    }

    @Override // p225w4.InterfaceC7144d
    public boolean A0(final p pVar) {
        return ((Boolean) A1(new b() { // from class: w4.o
            @Override // w4.M.b
            public final Object apply(Object obj) {
                return M.N(this.f50336a, pVar, (SQLiteDatabase) obj);
            }
        })).booleanValue();
    }

    Object A1(b bVar) {
        SQLiteDatabase sQLiteDatabaseU1 = u1();
        sQLiteDatabaseU1.beginTransaction();
        try {
            Object objApply = bVar.apply(sQLiteDatabaseU1);
            sQLiteDatabaseU1.setTransactionSuccessful();
            return objApply;
        } finally {
            sQLiteDatabaseU1.endTransaction();
        }
    }

    @Override // p225w4.InterfaceC7144d
    public long C0(p pVar) {
        return ((Long) L1(u1().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{pVar.b(), String.valueOf(p255z4.a.a(pVar.d()))}), new b() { // from class: w4.H
            @Override // w4.M.b
            public final Object apply(Object obj) {
                return M.o1((Cursor) obj);
            }
        })).longValue();
    }

    @Override // p225w4.InterfaceC7143c
    public void a() {
        A1(new b() { // from class: w4.q
            @Override // w4.M.b
            public final Object apply(Object obj) {
                return M.m1(this.f50340a, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // p225w4.InterfaceC7144d
    public void b1(final p pVar, final long j10) {
        A1(new b() { // from class: w4.p
            @Override // w4.M.b
            public final Object apply(Object obj) {
                return M.Q(j10, pVar, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // p235x4.b
    public Object c(x4.b.a aVar) {
        SQLiteDatabase sQLiteDatabaseU1 = u1();
        r1(sQLiteDatabaseU1);
        try {
            Object objA = aVar.a();
            sQLiteDatabaseU1.setTransactionSuccessful();
            return objA;
        } finally {
            sQLiteDatabaseU1.endTransaction();
        }
    }

    @Override // p225w4.InterfaceC7144d
    public Iterable c1(final p pVar) {
        return (Iterable) A1(new b() { // from class: w4.m
            @Override // w4.M.b
            public final Object apply(Object obj) {
                return M.v(this.f50334a, pVar, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f50288a.close();
    }

    @Override // p225w4.InterfaceC7144d
    public int e() {
        final long jA = this.f50289b.a() - this.f50291d.c();
        return ((Integer) A1(new b() { // from class: w4.J
            @Override // w4.M.b
            public final Object apply(Object obj) {
                return M.g1(this.f50282a, jA, (SQLiteDatabase) obj);
            }
        })).intValue();
    }

    @Override // p225w4.InterfaceC7144d
    public void g0(Iterable iterable) {
        if (iterable.iterator().hasNext()) {
            final String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + K1(iterable);
            final String str2 = "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name";
            A1(new b() { // from class: w4.L
                @Override // w4.M.b
                public final Object apply(Object obj) {
                    return M.M(this.f50284a, str, str2, (SQLiteDatabase) obj);
                }
            });
        }
    }

    @Override // p225w4.InterfaceC7143c
    public void h(final long j10, final r4.c.b bVar, final String str) {
        A1(new b() { // from class: w4.r
            @Override // w4.M.b
            public final Object apply(Object obj) {
                return M.R0(str, bVar, j10, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // p225w4.InterfaceC7143c
    public p175r4.a j() {
        final p175r4.a.C0524a c0524aE = p175r4.a.e();
        final HashMap map = new HashMap();
        final String str = "SELECT log_source, reason, events_dropped_count FROM log_event_dropped";
        return (p175r4.a) A1(new b() { // from class: w4.t
            @Override // w4.M.b
            public final Object apply(Object obj) {
                return M.n1(this.f50345a, str, map, c0524aE, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // p225w4.InterfaceC7144d
    public void m(Iterable iterable) {
        if (iterable.iterator().hasNext()) {
            u1().compileStatement("DELETE FROM events WHERE _id in " + K1(iterable)).execute();
        }
    }

    long t1() {
        return w1() * x1();
    }

    @Override // p225w4.InterfaceC7144d
    public Iterable u() {
        return (Iterable) A1(new b() { // from class: w4.G
            @Override // w4.M.b
            public final Object apply(Object obj) {
                return M.S((SQLiteDatabase) obj);
            }
        });
    }

    SQLiteDatabase u1() {
        final W w10 = this.f50288a;
        Objects.requireNonNull(w10);
        return (SQLiteDatabase) I1(new d() { // from class: w4.E
            @Override // w4.M.d
            public final Object a() {
                return w10.getWritableDatabase();
            }
        }, new b() { // from class: w4.F
            @Override // w4.M.b
            public final Object apply(Object obj) {
                return M.G((Throwable) obj);
            }
        });
    }

    @Override // p225w4.InterfaceC7144d
    public AbstractC7151k v0(final p pVar, final i iVar) {
        p185s4.a.c("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", pVar.d(), iVar.n(), pVar.b());
        long jLongValue = ((Long) A1(new b() { // from class: w4.I
            @Override // w4.M.b
            public final Object apply(Object obj) {
                return M.W(this.f50279a, iVar, pVar, (SQLiteDatabase) obj);
            }
        })).longValue();
        if (jLongValue < 1) {
            return null;
        }
        return AbstractC7151k.a(jLongValue, pVar, iVar);
    }
}
