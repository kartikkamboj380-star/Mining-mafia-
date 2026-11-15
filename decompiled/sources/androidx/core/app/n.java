package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Bundle f9143a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private IconCompat f9144b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final x[] f9145c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final x[] f9146d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f9147e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f9148f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f9149g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean f9150h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f9151i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public CharSequence f9152j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public PendingIntent f9153k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f9154l;

        /* JADX INFO: renamed from: androidx.core.app.n$a$a, reason: collision with other inner class name */
        public static final class C0146a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final IconCompat f9155a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final CharSequence f9156b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final PendingIntent f9157c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private boolean f9158d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private final Bundle f9159e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private ArrayList f9160f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private int f9161g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private boolean f9162h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private boolean f9163i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private boolean f9164j;

            public C0146a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
                this(iconCompat, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
            }

            private void c() {
                if (this.f9163i && this.f9157c == null) {
                    throw new NullPointerException("Contextual Actions must contain a valid PendingIntent");
                }
            }

            public C0146a a(x xVar) {
                if (this.f9160f == null) {
                    this.f9160f = new ArrayList();
                }
                if (xVar != null) {
                    this.f9160f.add(xVar);
                }
                return this;
            }

            public a b() {
                c();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = this.f9160f;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList3.get(i10);
                        i10++;
                        x xVar = (x) obj;
                        if (xVar.k()) {
                            arrayList.add(xVar);
                        } else {
                            arrayList2.add(xVar);
                        }
                    }
                }
                return new a(this.f9155a, this.f9156b, this.f9157c, this.f9159e, arrayList2.isEmpty() ? null : (x[]) arrayList2.toArray(new x[arrayList2.size()]), arrayList.isEmpty() ? null : (x[]) arrayList.toArray(new x[arrayList.size()]), this.f9158d, this.f9161g, this.f9162h, this.f9163i, this.f9164j);
            }

            public C0146a d(boolean z9) {
                this.f9158d = z9;
                return this;
            }

            private C0146a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, x[] xVarArr, boolean z9, int i10, boolean z10, boolean z11, boolean z12) {
                this.f9158d = true;
                this.f9162h = true;
                this.f9155a = iconCompat;
                this.f9156b = e.f(charSequence);
                this.f9157c = pendingIntent;
                this.f9159e = bundle;
                this.f9160f = xVarArr == null ? null : new ArrayList(Arrays.asList(xVarArr));
                this.f9158d = z9;
                this.f9161g = i10;
                this.f9162h = z10;
                this.f9163i = z11;
                this.f9164j = z12;
            }
        }

        public a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i10 != 0 ? IconCompat.d(null, "", i10) : null, charSequence, pendingIntent);
        }

        public PendingIntent a() {
            return this.f9153k;
        }

        public boolean b() {
            return this.f9147e;
        }

        public Bundle c() {
            return this.f9143a;
        }

        public IconCompat d() {
            int i10;
            if (this.f9144b == null && (i10 = this.f9151i) != 0) {
                this.f9144b = IconCompat.d(null, "", i10);
            }
            return this.f9144b;
        }

        public x[] e() {
            return this.f9145c;
        }

        public int f() {
            return this.f9149g;
        }

        public boolean g() {
            return this.f9148f;
        }

        public CharSequence h() {
            return this.f9152j;
        }

        public boolean i() {
            return this.f9154l;
        }

        public boolean j() {
            return this.f9150h;
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false, false);
        }

        a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, x[] xVarArr, x[] xVarArr2, boolean z9, int i10, boolean z10, boolean z11, boolean z12) {
            this.f9148f = true;
            this.f9144b = iconCompat;
            if (iconCompat != null && iconCompat.h() == 2) {
                this.f9151i = iconCompat.f();
            }
            this.f9152j = e.f(charSequence);
            this.f9153k = pendingIntent;
            this.f9143a = bundle == null ? new Bundle() : bundle;
            this.f9145c = xVarArr;
            this.f9146d = xVarArr2;
            this.f9147e = z9;
            this.f9149g = i10;
            this.f9148f = z10;
            this.f9150h = z11;
            this.f9154l = z12;
        }
    }

    public static class b extends h {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private IconCompat f9165e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private IconCompat f9166f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f9167g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private CharSequence f9168h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f9169i;

        private static class a {
            static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        /* JADX INFO: renamed from: androidx.core.app.n$b$b, reason: collision with other inner class name */
        private static class C0147b {
            static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigPicture(icon);
            }

            static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setContentDescription(charSequence);
            }

            static void c(Notification.BigPictureStyle bigPictureStyle, boolean z9) {
                bigPictureStyle.showBigPictureWhenCollapsed(z9);
            }
        }

        @Override // androidx.core.app.n.h
        public void b(m mVar) {
            Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(mVar.a()).setBigContentTitle(this.f9232b);
            IconCompat iconCompat = this.f9165e;
            if (iconCompat != null) {
                if (Build.VERSION.SDK_INT >= 31) {
                    C0147b.a(bigContentTitle, this.f9165e.o(mVar instanceof o ? ((o) mVar).f() : null));
                } else if (iconCompat.h() == 1) {
                    bigContentTitle = bigContentTitle.bigPicture(this.f9165e.e());
                }
            }
            if (this.f9167g) {
                if (this.f9166f == null) {
                    bigContentTitle.bigLargeIcon((Bitmap) null);
                } else {
                    a.a(bigContentTitle, this.f9166f.o(mVar instanceof o ? ((o) mVar).f() : null));
                }
            }
            if (this.f9234d) {
                bigContentTitle.setSummaryText(this.f9233c);
            }
            if (Build.VERSION.SDK_INT >= 31) {
                C0147b.c(bigContentTitle, this.f9169i);
                C0147b.b(bigContentTitle, this.f9168h);
            }
        }

        @Override // androidx.core.app.n.h
        protected String c() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        public b h(Bitmap bitmap) {
            this.f9166f = bitmap == null ? null : IconCompat.c(bitmap);
            this.f9167g = true;
            return this;
        }

        public b i(Bitmap bitmap) {
            this.f9165e = bitmap == null ? null : IconCompat.c(bitmap);
            return this;
        }

        public b j(CharSequence charSequence) {
            this.f9232b = e.f(charSequence);
            return this;
        }

        public b k(CharSequence charSequence) {
            this.f9233c = e.f(charSequence);
            this.f9234d = true;
            return this;
        }
    }

    public static class c extends h {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private CharSequence f9170e;

        @Override // androidx.core.app.n.h
        public void a(Bundle bundle) {
            super.a(bundle);
        }

        @Override // androidx.core.app.n.h
        public void b(m mVar) {
            Notification.BigTextStyle bigTextStyleBigText = new Notification.BigTextStyle(mVar.a()).setBigContentTitle(this.f9232b).bigText(this.f9170e);
            if (this.f9234d) {
                bigTextStyleBigText.setSummaryText(this.f9233c);
            }
        }

        @Override // androidx.core.app.n.h
        protected String c() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        public c h(CharSequence charSequence) {
            this.f9170e = e.f(charSequence);
            return this;
        }

        public c i(CharSequence charSequence) {
            this.f9232b = e.f(charSequence);
            return this;
        }

        public c j(CharSequence charSequence) {
            this.f9233c = e.f(charSequence);
            this.f9234d = true;
            return this;
        }
    }

    public static final class d {
        public static Notification.BubbleMetadata a(d dVar) {
            return null;
        }
    }

    public static class f extends h {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private ArrayList f9219e = new ArrayList();

        @Override // androidx.core.app.n.h
        public void b(m mVar) {
            Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(mVar.a()).setBigContentTitle(this.f9232b);
            if (this.f9234d) {
                bigContentTitle.setSummaryText(this.f9233c);
            }
            ArrayList arrayList = this.f9219e;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                bigContentTitle.addLine((CharSequence) obj);
            }
        }

        @Override // androidx.core.app.n.h
        protected String c() {
            return "androidx.core.app.NotificationCompat$InboxStyle";
        }

        public f h(CharSequence charSequence) {
            if (charSequence != null) {
                this.f9219e.add(e.f(charSequence));
            }
            return this;
        }

        public f i(CharSequence charSequence) {
            this.f9232b = e.f(charSequence);
            return this;
        }

        public f j(CharSequence charSequence) {
            this.f9233c = e.f(charSequence);
            this.f9234d = true;
            return this;
        }
    }

    public static class g extends h {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final List f9220e = new ArrayList();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final List f9221f = new ArrayList();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private v f9222g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private CharSequence f9223h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private Boolean f9224i;

        static class a {
            static Notification.MessagingStyle a(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
                return messagingStyle.addMessage(message);
            }

            static Notification.MessagingStyle b(CharSequence charSequence) {
                return new Notification.MessagingStyle(charSequence);
            }

            static Notification.MessagingStyle c(Notification.MessagingStyle messagingStyle, CharSequence charSequence) {
                return messagingStyle.setConversationTitle(charSequence);
            }
        }

        static class b {
            static Notification.MessagingStyle a(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
                return messagingStyle.addHistoricMessage(message);
            }
        }

        static class c {
            static Notification.MessagingStyle a(Person person) {
                return new Notification.MessagingStyle(person);
            }

            static Notification.MessagingStyle b(Notification.MessagingStyle messagingStyle, boolean z9) {
                return messagingStyle.setGroupConversation(z9);
            }
        }

        public static final class d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final CharSequence f9225a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final long f9226b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final v f9227c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private Bundle f9228d = new Bundle();

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private String f9229e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private Uri f9230f;

            static class a {
                static Notification.MessagingStyle.Message a(CharSequence charSequence, long j10, CharSequence charSequence2) {
                    return new Notification.MessagingStyle.Message(charSequence, j10, charSequence2);
                }

                static Notification.MessagingStyle.Message b(Notification.MessagingStyle.Message message, String str, Uri uri) {
                    return message.setData(str, uri);
                }
            }

            static class b {
                static Parcelable a(Person person) {
                    return person;
                }

                static Notification.MessagingStyle.Message b(CharSequence charSequence, long j10, Person person) {
                    return new Notification.MessagingStyle.Message(charSequence, j10, person);
                }
            }

            public d(CharSequence charSequence, long j10, v vVar) {
                this.f9225a = charSequence;
                this.f9226b = j10;
                this.f9227c = vVar;
            }

            static Bundle[] a(List list) {
                Bundle[] bundleArr = new Bundle[list.size()];
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    bundleArr[i10] = ((d) list.get(i10)).h();
                }
                return bundleArr;
            }

            private Bundle h() {
                Bundle bundle = new Bundle();
                CharSequence charSequence = this.f9225a;
                if (charSequence != null) {
                    bundle.putCharSequence("text", charSequence);
                }
                bundle.putLong("time", this.f9226b);
                v vVar = this.f9227c;
                if (vVar != null) {
                    bundle.putCharSequence("sender", vVar.c());
                    if (Build.VERSION.SDK_INT >= 28) {
                        bundle.putParcelable("sender_person", b.a(this.f9227c.h()));
                    } else {
                        bundle.putBundle("person", this.f9227c.i());
                    }
                }
                String str = this.f9229e;
                if (str != null) {
                    bundle.putString(HandleInvocationsFromAdViewer.KEY_AD_TYPE, str);
                }
                Uri uri = this.f9230f;
                if (uri != null) {
                    bundle.putParcelable("uri", uri);
                }
                Bundle bundle2 = this.f9228d;
                if (bundle2 != null) {
                    bundle.putBundle(HandleInvocationsFromAdViewer.KEY_EXTRAS, bundle2);
                }
                return bundle;
            }

            public String b() {
                return this.f9229e;
            }

            public Uri c() {
                return this.f9230f;
            }

            public v d() {
                return this.f9227c;
            }

            public CharSequence e() {
                return this.f9225a;
            }

            public long f() {
                return this.f9226b;
            }

            Notification.MessagingStyle.Message g() {
                Notification.MessagingStyle.Message messageA;
                v vVarD = d();
                if (Build.VERSION.SDK_INT >= 28) {
                    messageA = b.b(e(), f(), vVarD != null ? vVarD.h() : null);
                } else {
                    messageA = a.a(e(), f(), vVarD != null ? vVarD.c() : null);
                }
                if (b() != null) {
                    a.b(messageA, b(), c());
                }
                return messageA;
            }
        }

        public g(v vVar) {
            if (TextUtils.isEmpty(vVar.c())) {
                throw new IllegalArgumentException("User's name must not be empty.");
            }
            this.f9222g = vVar;
        }

        @Override // androidx.core.app.n.h
        public void a(Bundle bundle) {
            super.a(bundle);
            bundle.putCharSequence("android.selfDisplayName", this.f9222g.c());
            bundle.putBundle("android.messagingStyleUser", this.f9222g.i());
            bundle.putCharSequence("android.hiddenConversationTitle", this.f9223h);
            if (this.f9223h != null && this.f9224i.booleanValue()) {
                bundle.putCharSequence("android.conversationTitle", this.f9223h);
            }
            if (!this.f9220e.isEmpty()) {
                bundle.putParcelableArray("android.messages", d.a(this.f9220e));
            }
            if (!this.f9221f.isEmpty()) {
                bundle.putParcelableArray("android.messages.historic", d.a(this.f9221f));
            }
            Boolean bool = this.f9224i;
            if (bool != null) {
                bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
            }
        }

        @Override // androidx.core.app.n.h
        public void b(m mVar) {
            l(j());
            Notification.MessagingStyle messagingStyleA = Build.VERSION.SDK_INT >= 28 ? c.a(this.f9222g.h()) : a.b(this.f9222g.c());
            Iterator it = this.f9220e.iterator();
            while (it.hasNext()) {
                a.a(messagingStyleA, ((d) it.next()).g());
            }
            if (Build.VERSION.SDK_INT >= 26) {
                Iterator it2 = this.f9221f.iterator();
                while (it2.hasNext()) {
                    b.a(messagingStyleA, ((d) it2.next()).g());
                }
            }
            if (this.f9224i.booleanValue() || Build.VERSION.SDK_INT >= 28) {
                a.c(messagingStyleA, this.f9223h);
            }
            if (Build.VERSION.SDK_INT >= 28) {
                c.b(messagingStyleA, this.f9224i.booleanValue());
            }
            messagingStyleA.setBuilder(mVar.a());
        }

        @Override // androidx.core.app.n.h
        protected String c() {
            return "androidx.core.app.NotificationCompat$MessagingStyle";
        }

        public g h(d dVar) {
            if (dVar != null) {
                this.f9220e.add(dVar);
                if (this.f9220e.size() > 25) {
                    this.f9220e.remove(0);
                }
            }
            return this;
        }

        public g i(CharSequence charSequence, long j10, v vVar) {
            h(new d(charSequence, j10, vVar));
            return this;
        }

        public boolean j() {
            e eVar = this.f9231a;
            if (eVar != null && eVar.f9193a.getApplicationInfo().targetSdkVersion < 28 && this.f9224i == null) {
                return this.f9223h != null;
            }
            Boolean bool = this.f9224i;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }

        public g k(CharSequence charSequence) {
            this.f9223h = charSequence;
            return this;
        }

        public g l(boolean z9) {
            this.f9224i = Boolean.valueOf(z9);
            return this;
        }
    }

    public static abstract class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected e f9231a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        CharSequence f9232b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        CharSequence f9233c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f9234d = false;

        public void a(Bundle bundle) {
            if (this.f9234d) {
                bundle.putCharSequence("android.summaryText", this.f9233c);
            }
            CharSequence charSequence = this.f9232b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String strC = c();
            if (strC != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", strC);
            }
        }

        public abstract void b(m mVar);

        protected abstract String c();

        public RemoteViews d(m mVar) {
            return null;
        }

        public RemoteViews e(m mVar) {
            return null;
        }

        public RemoteViews f(m mVar) {
            return null;
        }

        public void g(e eVar) {
            if (this.f9231a != eVar) {
                this.f9231a = eVar;
                if (eVar != null) {
                    eVar.N(this);
                }
            }
        }
    }

    public static Bundle a(Notification notification) {
        return notification.extras;
    }

    public static Bitmap b(Context context, Bitmap bitmap) {
        if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
            return bitmap;
        }
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(B.b.f56b);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(B.b.f55a);
        if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
            return bitmap;
        }
        double dMin = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
        return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * dMin), (int) Math.ceil(((double) bitmap.getHeight()) * dMin), true);
    }

    public static class e {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        boolean f9171A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        boolean f9172B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        boolean f9173C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        String f9174D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        Bundle f9175E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        int f9176F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f9177G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        Notification f9178H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        RemoteViews f9179I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        RemoteViews f9180J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        RemoteViews f9181K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        String f9182L;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        int f9183M;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        String f9184N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        long f9185O;

        /* JADX INFO: renamed from: P, reason: collision with root package name */
        int f9186P;

        /* JADX INFO: renamed from: Q, reason: collision with root package name */
        int f9187Q;

        /* JADX INFO: renamed from: R, reason: collision with root package name */
        boolean f9188R;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        Notification f9189S;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        boolean f9190T;

        /* JADX INFO: renamed from: U, reason: collision with root package name */
        Object f9191U;

        /* JADX INFO: renamed from: V, reason: collision with root package name */
        public ArrayList f9192V;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Context f9193a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ArrayList f9194b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ArrayList f9195c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        ArrayList f9196d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        CharSequence f9197e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        CharSequence f9198f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        PendingIntent f9199g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        PendingIntent f9200h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        RemoteViews f9201i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        IconCompat f9202j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        CharSequence f9203k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f9204l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f9205m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        boolean f9206n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        boolean f9207o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        boolean f9208p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        h f9209q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        CharSequence f9210r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        CharSequence f9211s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        CharSequence[] f9212t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f9213u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f9214v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        boolean f9215w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        String f9216x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        boolean f9217y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        String f9218z;

        static class a {
            static AudioAttributes a(AudioAttributes.Builder builder) {
                return builder.build();
            }

            static AudioAttributes.Builder b() {
                return new AudioAttributes.Builder();
            }

            static AudioAttributes.Builder c(AudioAttributes.Builder builder, int i10) {
                return builder.setContentType(i10);
            }

            static AudioAttributes.Builder d(AudioAttributes.Builder builder, int i10) {
                return builder.setUsage(i10);
            }
        }

        public e(Context context, String str) {
            this.f9194b = new ArrayList();
            this.f9195c = new ArrayList();
            this.f9196d = new ArrayList();
            this.f9206n = true;
            this.f9171A = false;
            this.f9176F = 0;
            this.f9177G = 0;
            this.f9183M = 0;
            this.f9186P = 0;
            this.f9187Q = 0;
            Notification notification = new Notification();
            this.f9189S = notification;
            this.f9193a = context;
            this.f9182L = str;
            notification.when = System.currentTimeMillis();
            this.f9189S.audioStreamType = -1;
            this.f9205m = 0;
            this.f9192V = new ArrayList();
            this.f9188R = true;
        }

        protected static CharSequence f(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        private void t(int i10, boolean z9) {
            if (z9) {
                Notification notification = this.f9189S;
                notification.flags = i10 | notification.flags;
            } else {
                Notification notification2 = this.f9189S;
                notification2.flags = (~i10) & notification2.flags;
            }
        }

        public e A(boolean z9) {
            this.f9171A = z9;
            return this;
        }

        public e B(int i10) {
            this.f9204l = i10;
            return this;
        }

        public e C(boolean z9) {
            t(2, z9);
            return this;
        }

        public e D(boolean z9) {
            t(8, z9);
            return this;
        }

        public e E(int i10) {
            this.f9205m = i10;
            return this;
        }

        public e F(int i10, int i11, boolean z9) {
            this.f9213u = i10;
            this.f9214v = i11;
            this.f9215w = z9;
            return this;
        }

        public e G(CharSequence[] charSequenceArr) {
            this.f9212t = charSequenceArr;
            return this;
        }

        public e H(String str) {
            this.f9184N = str;
            return this;
        }

        public e I(boolean z9) {
            this.f9206n = z9;
            return this;
        }

        public e J(int i10) {
            this.f9189S.icon = i10;
            return this;
        }

        public e K(int i10, int i11) {
            Notification notification = this.f9189S;
            notification.icon = i10;
            notification.iconLevel = i11;
            return this;
        }

        public e L(String str) {
            this.f9218z = str;
            return this;
        }

        public e M(Uri uri) {
            Notification notification = this.f9189S;
            notification.sound = uri;
            notification.audioStreamType = -1;
            AudioAttributes.Builder builderD = a.d(a.c(a.b(), 4), 5);
            this.f9189S.audioAttributes = a.a(builderD);
            return this;
        }

        public e N(h hVar) {
            if (this.f9209q != hVar) {
                this.f9209q = hVar;
                if (hVar != null) {
                    hVar.g(this);
                }
            }
            return this;
        }

        public e O(CharSequence charSequence) {
            this.f9210r = f(charSequence);
            return this;
        }

        public e P(CharSequence charSequence) {
            this.f9189S.tickerText = f(charSequence);
            return this;
        }

        public e Q(long j10) {
            this.f9185O = j10;
            return this;
        }

        public e R(boolean z9) {
            this.f9207o = z9;
            return this;
        }

        public e S(long[] jArr) {
            this.f9189S.vibrate = jArr;
            return this;
        }

        public e T(int i10) {
            this.f9177G = i10;
            return this;
        }

        public e U(long j10) {
            this.f9189S.when = j10;
            return this;
        }

        public e a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f9194b.add(new a(i10, charSequence, pendingIntent));
            return this;
        }

        public e b(a aVar) {
            if (aVar != null) {
                this.f9194b.add(aVar);
            }
            return this;
        }

        public e c(Bundle bundle) {
            if (bundle != null) {
                Bundle bundle2 = this.f9175E;
                if (bundle2 == null) {
                    this.f9175E = new Bundle(bundle);
                    return this;
                }
                bundle2.putAll(bundle);
            }
            return this;
        }

        public Notification d() {
            return new o(this).c();
        }

        public Bundle e() {
            if (this.f9175E == null) {
                this.f9175E = new Bundle();
            }
            return this.f9175E;
        }

        public e g(boolean z9) {
            t(16, z9);
            return this;
        }

        public e h(int i10) {
            this.f9183M = i10;
            return this;
        }

        public e i(String str) {
            this.f9174D = str;
            return this;
        }

        public e j(String str) {
            this.f9182L = str;
            return this;
        }

        public e k(boolean z9) {
            this.f9208p = z9;
            e().putBoolean("android.chronometerCountDown", z9);
            return this;
        }

        public e l(int i10) {
            this.f9176F = i10;
            return this;
        }

        public e m(boolean z9) {
            this.f9172B = z9;
            this.f9173C = true;
            return this;
        }

        public e n(PendingIntent pendingIntent) {
            this.f9199g = pendingIntent;
            return this;
        }

        public e o(CharSequence charSequence) {
            this.f9198f = f(charSequence);
            return this;
        }

        public e p(CharSequence charSequence) {
            this.f9197e = f(charSequence);
            return this;
        }

        public e q(int i10) {
            Notification notification = this.f9189S;
            notification.defaults = i10;
            if ((i10 & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        public e r(PendingIntent pendingIntent) {
            this.f9189S.deleteIntent = pendingIntent;
            return this;
        }

        public e s(Bundle bundle) {
            this.f9175E = bundle;
            return this;
        }

        public e u(PendingIntent pendingIntent, boolean z9) {
            this.f9200h = pendingIntent;
            t(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT, z9);
            return this;
        }

        public e v(String str) {
            this.f9216x = str;
            return this;
        }

        public e w(int i10) {
            this.f9186P = i10;
            return this;
        }

        public e x(boolean z9) {
            this.f9217y = z9;
            return this;
        }

        public e y(Bitmap bitmap) {
            this.f9202j = bitmap == null ? null : IconCompat.c(n.b(this.f9193a, bitmap));
            return this;
        }

        public e z(int i10, int i11, int i12) {
            Notification notification = this.f9189S;
            notification.ledARGB = i10;
            notification.ledOnMS = i11;
            notification.ledOffMS = i12;
            notification.flags = ((i11 == 0 || i12 == 0) ? 0 : 1) | (notification.flags & (-2));
            return this;
        }

        public e(Context context) {
            this(context, null);
        }
    }
}
