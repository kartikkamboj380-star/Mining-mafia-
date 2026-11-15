package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class o implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f9235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Notification.Builder f9236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n.e f9237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private RemoteViews f9238d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private RemoteViews f9239e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f9240f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Bundle f9241g = new Bundle();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f9242h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private RemoteViews f9243i;

    static class a {
        static Notification.Builder a(Notification.Builder builder, Notification.Action action) {
            return builder.addAction(action);
        }

        static Notification.Action.Builder b(Notification.Action.Builder builder, Bundle bundle) {
            return builder.addExtras(bundle);
        }

        static Notification.Action.Builder c(Notification.Action.Builder builder, RemoteInput remoteInput) {
            return builder.addRemoteInput(remoteInput);
        }

        static Notification.Action d(Notification.Action.Builder builder) {
            return builder.build();
        }

        static String e(Notification notification) {
            return notification.getGroup();
        }

        static Notification.Builder f(Notification.Builder builder, String str) {
            return builder.setGroup(str);
        }

        static Notification.Builder g(Notification.Builder builder, boolean z9) {
            return builder.setGroupSummary(z9);
        }

        static Notification.Builder h(Notification.Builder builder, boolean z9) {
            return builder.setLocalOnly(z9);
        }

        static Notification.Builder i(Notification.Builder builder, String str) {
            return builder.setSortKey(str);
        }
    }

    static class b {
        static Notification.Builder a(Notification.Builder builder, String str) {
            return builder.addPerson(str);
        }

        static Notification.Builder b(Notification.Builder builder, String str) {
            return builder.setCategory(str);
        }

        static Notification.Builder c(Notification.Builder builder, int i10) {
            return builder.setColor(i10);
        }

        static Notification.Builder d(Notification.Builder builder, Notification notification) {
            return builder.setPublicVersion(notification);
        }

        static Notification.Builder e(Notification.Builder builder, Uri uri, Object obj) {
            return builder.setSound(uri, (AudioAttributes) obj);
        }

        static Notification.Builder f(Notification.Builder builder, int i10) {
            return builder.setVisibility(i10);
        }
    }

    static class c {
        static Notification.Action.Builder a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(icon, charSequence, pendingIntent);
        }

        static Notification.Builder b(Notification.Builder builder, Icon icon) {
            return builder.setLargeIcon(icon);
        }

        static Notification.Builder c(Notification.Builder builder, Object obj) {
            return builder.setSmallIcon((Icon) obj);
        }
    }

    static class d {
        static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z9) {
            return builder.setAllowGeneratedReplies(z9);
        }

        static Notification.Builder b(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomBigContentView(remoteViews);
        }

        static Notification.Builder c(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomContentView(remoteViews);
        }

        static Notification.Builder d(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomHeadsUpContentView(remoteViews);
        }

        static Notification.Builder e(Notification.Builder builder, CharSequence[] charSequenceArr) {
            return builder.setRemoteInputHistory(charSequenceArr);
        }
    }

    static class e {
        static Notification.Builder a(Context context, String str) {
            return new Notification.Builder(context, str);
        }

        static Notification.Builder b(Notification.Builder builder, int i10) {
            return builder.setBadgeIconType(i10);
        }

        static Notification.Builder c(Notification.Builder builder, boolean z9) {
            return builder.setColorized(z9);
        }

        static Notification.Builder d(Notification.Builder builder, int i10) {
            return builder.setGroupAlertBehavior(i10);
        }

        static Notification.Builder e(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSettingsText(charSequence);
        }

        static Notification.Builder f(Notification.Builder builder, String str) {
            return builder.setShortcutId(str);
        }

        static Notification.Builder g(Notification.Builder builder, long j10) {
            return builder.setTimeoutAfter(j10);
        }
    }

    static class f {
        static Notification.Builder a(Notification.Builder builder, Person person) {
            return builder.addPerson(person);
        }

        static Notification.Action.Builder b(Notification.Action.Builder builder, int i10) {
            return builder.setSemanticAction(i10);
        }
    }

    static class g {
        static Notification.Builder a(Notification.Builder builder, boolean z9) {
            return builder.setAllowSystemGeneratedContextualActions(z9);
        }

        static Notification.Builder b(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
            return builder.setBubbleMetadata(bubbleMetadata);
        }

        static Notification.Action.Builder c(Notification.Action.Builder builder, boolean z9) {
            return builder.setContextual(z9);
        }
    }

    static class h {
        static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z9) {
            return builder.setAuthenticationRequired(z9);
        }

        static Notification.Builder b(Notification.Builder builder, int i10) {
            return builder.setForegroundServiceBehavior(i10);
        }
    }

    o(n.e eVar) {
        int i10;
        this.f9237c = eVar;
        Context context = eVar.f9193a;
        this.f9235a = context;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f9236b = e.a(context, eVar.f9182L);
        } else {
            this.f9236b = new Notification.Builder(eVar.f9193a);
        }
        Notification notification = eVar.f9189S;
        int i11 = 0;
        this.f9236b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, eVar.f9201i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(eVar.f9197e).setContentText(eVar.f9198f).setContentInfo(eVar.f9203k).setContentIntent(eVar.f9199g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(eVar.f9200h, (notification.flags & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0).setNumber(eVar.f9204l).setProgress(eVar.f9213u, eVar.f9214v, eVar.f9215w);
        Notification.Builder builder = this.f9236b;
        IconCompat iconCompat = eVar.f9202j;
        c.b(builder, iconCompat == null ? null : iconCompat.o(context));
        this.f9236b.setSubText(eVar.f9210r).setUsesChronometer(eVar.f9207o).setPriority(eVar.f9205m);
        ArrayList arrayList = eVar.f9194b;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            b((n.a) obj);
        }
        Bundle bundle = eVar.f9175E;
        if (bundle != null) {
            this.f9241g.putAll(bundle);
        }
        int i13 = Build.VERSION.SDK_INT;
        this.f9238d = eVar.f9179I;
        this.f9239e = eVar.f9180J;
        this.f9236b.setShowWhen(eVar.f9206n);
        a.h(this.f9236b, eVar.f9171A);
        a.f(this.f9236b, eVar.f9216x);
        a.i(this.f9236b, eVar.f9218z);
        a.g(this.f9236b, eVar.f9217y);
        this.f9242h = eVar.f9186P;
        b.b(this.f9236b, eVar.f9174D);
        b.c(this.f9236b, eVar.f9176F);
        b.f(this.f9236b, eVar.f9177G);
        b.d(this.f9236b, eVar.f9178H);
        b.e(this.f9236b, notification.sound, notification.audioAttributes);
        List listE = i13 < 28 ? e(g(eVar.f9195c), eVar.f9192V) : eVar.f9192V;
        if (listE != null && !listE.isEmpty()) {
            Iterator it = listE.iterator();
            while (it.hasNext()) {
                b.a(this.f9236b, (String) it.next());
            }
        }
        this.f9243i = eVar.f9181K;
        if (eVar.f9196d.size() > 0) {
            Bundle bundle2 = eVar.e().getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i14 = 0; i14 < eVar.f9196d.size(); i14++) {
                bundle4.putBundle(Integer.toString(i14), p.a((n.a) eVar.f9196d.get(i14)));
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            eVar.e().putBundle("android.car.EXTENSIONS", bundle2);
            this.f9241g.putBundle("android.car.EXTENSIONS", bundle3);
        }
        int i15 = Build.VERSION.SDK_INT;
        Object obj2 = eVar.f9191U;
        if (obj2 != null) {
            c.c(this.f9236b, obj2);
        }
        this.f9236b.setExtras(eVar.f9175E);
        d.e(this.f9236b, eVar.f9212t);
        RemoteViews remoteViews = eVar.f9179I;
        if (remoteViews != null) {
            d.c(this.f9236b, remoteViews);
        }
        RemoteViews remoteViews2 = eVar.f9180J;
        if (remoteViews2 != null) {
            d.b(this.f9236b, remoteViews2);
        }
        RemoteViews remoteViews3 = eVar.f9181K;
        if (remoteViews3 != null) {
            d.d(this.f9236b, remoteViews3);
        }
        if (i15 >= 26) {
            e.b(this.f9236b, eVar.f9183M);
            e.e(this.f9236b, eVar.f9211s);
            e.f(this.f9236b, eVar.f9184N);
            e.g(this.f9236b, eVar.f9185O);
            e.d(this.f9236b, eVar.f9186P);
            if (eVar.f9173C) {
                e.c(this.f9236b, eVar.f9172B);
            }
            if (!TextUtils.isEmpty(eVar.f9182L)) {
                this.f9236b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i15 >= 28) {
            ArrayList arrayList2 = eVar.f9195c;
            int size2 = arrayList2.size();
            while (i11 < size2) {
                Object obj3 = arrayList2.get(i11);
                i11++;
                f.a(this.f9236b, ((v) obj3).h());
            }
        }
        int i16 = Build.VERSION.SDK_INT;
        if (i16 >= 29) {
            g.a(this.f9236b, eVar.f9188R);
            g.b(this.f9236b, n.d.a(null));
        }
        if (i16 >= 31 && (i10 = eVar.f9187Q) != 0) {
            h.b(this.f9236b, i10);
        }
        if (eVar.f9190T) {
            if (this.f9237c.f9217y) {
                this.f9242h = 2;
            } else {
                this.f9242h = 1;
            }
            this.f9236b.setVibrate(null);
            this.f9236b.setSound(null);
            int i17 = notification.defaults & (-4);
            notification.defaults = i17;
            this.f9236b.setDefaults(i17);
            if (i16 >= 26) {
                if (TextUtils.isEmpty(this.f9237c.f9216x)) {
                    a.f(this.f9236b, "silent");
                }
                e.d(this.f9236b, this.f9242h);
            }
        }
    }

    private void b(n.a aVar) {
        IconCompat iconCompatD = aVar.d();
        Notification.Action.Builder builderA = c.a(iconCompatD != null ? iconCompatD.n() : null, aVar.h(), aVar.a());
        if (aVar.e() != null) {
            for (RemoteInput remoteInput : x.b(aVar.e())) {
                a.c(builderA, remoteInput);
            }
        }
        Bundle bundle = aVar.c() != null ? new Bundle(aVar.c()) : new Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        int i10 = Build.VERSION.SDK_INT;
        d.a(builderA, aVar.b());
        bundle.putInt("android.support.action.semanticAction", aVar.f());
        if (i10 >= 28) {
            f.b(builderA, aVar.f());
        }
        if (i10 >= 29) {
            g.c(builderA, aVar.j());
        }
        if (i10 >= 31) {
            h.a(builderA, aVar.i());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", aVar.g());
        a.b(builderA, bundle);
        a.a(this.f9236b, a.d(builderA));
    }

    private static List e(List list, List list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        p190t.b bVar = new p190t.b(list.size() + list2.size());
        bVar.addAll(list);
        bVar.addAll(list2);
        return new ArrayList(bVar);
    }

    private static List g(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((v) it.next()).g());
        }
        return arrayList;
    }

    private void h(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -4;
    }

    @Override // androidx.core.app.m
    public Notification.Builder a() {
        return this.f9236b;
    }

    public Notification c() {
        Bundle bundleA;
        RemoteViews remoteViewsF;
        RemoteViews remoteViewsD;
        n.h hVar = this.f9237c.f9209q;
        if (hVar != null) {
            hVar.b(this);
        }
        RemoteViews remoteViewsE = hVar != null ? hVar.e(this) : null;
        Notification notificationD = d();
        if (remoteViewsE != null) {
            notificationD.contentView = remoteViewsE;
        } else {
            RemoteViews remoteViews = this.f9237c.f9179I;
            if (remoteViews != null) {
                notificationD.contentView = remoteViews;
            }
        }
        if (hVar != null && (remoteViewsD = hVar.d(this)) != null) {
            notificationD.bigContentView = remoteViewsD;
        }
        if (hVar != null && (remoteViewsF = this.f9237c.f9209q.f(this)) != null) {
            notificationD.headsUpContentView = remoteViewsF;
        }
        if (hVar != null && (bundleA = n.a(notificationD)) != null) {
            hVar.a(bundleA);
        }
        return notificationD;
    }

    protected Notification d() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f9236b.build();
        }
        Notification notificationBuild = this.f9236b.build();
        if (this.f9242h != 0) {
            if (a.e(notificationBuild) != null && (notificationBuild.flags & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 && this.f9242h == 2) {
                h(notificationBuild);
            }
            if (a.e(notificationBuild) != null && (notificationBuild.flags & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 0 && this.f9242h == 1) {
                h(notificationBuild);
            }
        }
        return notificationBuild;
    }

    Context f() {
        return this.f9235a;
    }
}
