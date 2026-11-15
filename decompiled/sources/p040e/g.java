package p040e;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IntentSender f43222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Intent f43223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f43224c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f43225d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f43221e = new c(null);

    @NotNull
    public static final Parcelable.Creator<g> CREATOR = new b();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final IntentSender f43226a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Intent f43227b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f43228c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f43229d;

        public a(IntentSender intentSender) {
            Intrinsics.checkNotNullParameter(intentSender, "intentSender");
            this.f43226a = intentSender;
        }

        public final g a() {
            return new g(this.f43226a, this.f43227b, this.f43228c, this.f43229d);
        }

        public final a b(Intent intent) {
            this.f43227b = intent;
            return this;
        }

        public final a c(int i10, int i11) {
            this.f43229d = i10;
            this.f43228c = i11;
            return this;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public a(PendingIntent pendingIntent) {
            Intrinsics.checkNotNullParameter(pendingIntent, "pendingIntent");
            IntentSender intentSender = pendingIntent.getIntentSender();
            Intrinsics.checkNotNullExpressionValue(intentSender, "pendingIntent.intentSender");
            this(intentSender);
        }
    }

    public static final class b implements Parcelable.Creator {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public g createFromParcel(Parcel inParcel) {
            Intrinsics.checkNotNullParameter(inParcel, "inParcel");
            return new g(inParcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public g[] newArray(int i10) {
            return new g[i10];
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    public g(IntentSender intentSender, Intent intent, int i10, int i11) {
        Intrinsics.checkNotNullParameter(intentSender, "intentSender");
        this.f43222a = intentSender;
        this.f43223b = intent;
        this.f43224c = i10;
        this.f43225d = i11;
    }

    public final Intent a() {
        return this.f43223b;
    }

    public final int b() {
        return this.f43224c;
    }

    public final int c() {
        return this.f43225d;
    }

    public final IntentSender d() {
        return this.f43222a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i10) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f43222a, i10);
        dest.writeParcelable(this.f43223b, i10);
        dest.writeInt(this.f43224c);
        dest.writeInt(this.f43225d);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public g(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
        Intrinsics.c(parcelable);
        this((IntentSender) parcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
    }
}
