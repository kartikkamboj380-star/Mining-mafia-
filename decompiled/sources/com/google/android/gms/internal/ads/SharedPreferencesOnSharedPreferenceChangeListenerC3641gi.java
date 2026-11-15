package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.text.TextUtils;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.gms.common.wrappers.Wrappers;
import com.tenjin.android.config.TenjinConsts;
import com.unity3d.services.core.di.ServiceProvider;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.gi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class SharedPreferencesOnSharedPreferenceChangeListenerC3641gi implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Context f28712g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f28706a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConditionVariable f28707b = new ConditionVariable();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile boolean f28708c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    volatile boolean f28709d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private SharedPreferences f28710e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Bundle f28711f = new Bundle();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private JSONObject f28713h = new JSONObject();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f28714i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f28715j = false;

    private final void g(final SharedPreferences sharedPreferences) {
        if (sharedPreferences != null) {
            try {
                this.f28713h = new JSONObject((String) AbstractC4143ki.a(new InterfaceC4166kt0() { // from class: com.google.android.gms.internal.ads.di
                    @Override // com.google.android.gms.internal.ads.InterfaceC4166kt0
                    public final /* synthetic */ Object zza() {
                        return sharedPreferences.getString("flag_configuration", "{}");
                    }
                }));
            } catch (JSONException unused) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00ae A[Catch: all -> 0x0054, TRY_ENTER, TryCatch #2 {all -> 0x0054, blocks: (B:22:0x0046, B:37:0x0064, B:39:0x006d, B:40:0x0075, B:42:0x007b, B:44:0x008b, B:46:0x00a0, B:50:0x00ae, B:52:0x00b2, B:54:0x00c2, B:56:0x00d7, B:59:0x00e3, B:69:0x0122, B:73:0x012f, B:75:0x013c, B:77:0x014a, B:78:0x0153, B:80:0x0161, B:82:0x0165, B:83:0x0168, B:62:0x00f4, B:64:0x0102, B:66:0x010a, B:67:0x0115, B:26:0x004d, B:32:0x005a), top: B:97:0x0046, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00b2 A[Catch: all -> 0x0054, TryCatch #2 {all -> 0x0054, blocks: (B:22:0x0046, B:37:0x0064, B:39:0x006d, B:40:0x0075, B:42:0x007b, B:44:0x008b, B:46:0x00a0, B:50:0x00ae, B:52:0x00b2, B:54:0x00c2, B:56:0x00d7, B:59:0x00e3, B:69:0x0122, B:73:0x012f, B:75:0x013c, B:77:0x014a, B:78:0x0153, B:80:0x0161, B:82:0x0165, B:83:0x0168, B:62:0x00f4, B:64:0x0102, B:66:0x010a, B:67:0x0115, B:26:0x004d, B:32:0x005a), top: B:97:0x0046, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x00e3 A[Catch: all -> 0x0054, TRY_ENTER, TryCatch #2 {all -> 0x0054, blocks: (B:22:0x0046, B:37:0x0064, B:39:0x006d, B:40:0x0075, B:42:0x007b, B:44:0x008b, B:46:0x00a0, B:50:0x00ae, B:52:0x00b2, B:54:0x00c2, B:56:0x00d7, B:59:0x00e3, B:69:0x0122, B:73:0x012f, B:75:0x013c, B:77:0x014a, B:78:0x0153, B:80:0x0161, B:82:0x0165, B:83:0x0168, B:62:0x00f4, B:64:0x0102, B:66:0x010a, B:67:0x0115, B:26:0x004d, B:32:0x005a), top: B:97:0x0046, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f4 A[Catch: all -> 0x0054, TryCatch #2 {all -> 0x0054, blocks: (B:22:0x0046, B:37:0x0064, B:39:0x006d, B:40:0x0075, B:42:0x007b, B:44:0x008b, B:46:0x00a0, B:50:0x00ae, B:52:0x00b2, B:54:0x00c2, B:56:0x00d7, B:59:0x00e3, B:69:0x0122, B:73:0x012f, B:75:0x013c, B:77:0x014a, B:78:0x0153, B:80:0x0161, B:82:0x0165, B:83:0x0168, B:62:0x00f4, B:64:0x0102, B:66:0x010a, B:67:0x0115, B:26:0x004d, B:32:0x005a), top: B:97:0x0046, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0102 A[Catch: all -> 0x0054, TryCatch #2 {all -> 0x0054, blocks: (B:22:0x0046, B:37:0x0064, B:39:0x006d, B:40:0x0075, B:42:0x007b, B:44:0x008b, B:46:0x00a0, B:50:0x00ae, B:52:0x00b2, B:54:0x00c2, B:56:0x00d7, B:59:0x00e3, B:69:0x0122, B:73:0x012f, B:75:0x013c, B:77:0x014a, B:78:0x0153, B:80:0x0161, B:82:0x0165, B:83:0x0168, B:62:0x00f4, B:64:0x0102, B:66:0x010a, B:67:0x0115, B:26:0x004d, B:32:0x005a), top: B:97:0x0046, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0126 A[Catch: all -> 0x000f, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x000f, blocks: (B:7:0x0009, B:9:0x000d, B:13:0x0012, B:15:0x0017, B:16:0x0019, B:18:0x002b, B:19:0x002f, B:20:0x0031, B:47:0x00a4, B:48:0x00ab, B:57:0x00db, B:71:0x0126, B:84:0x016f, B:85:0x0176, B:87:0x0178, B:88:0x017f, B:22:0x0046, B:37:0x0064, B:39:0x006d, B:40:0x0075, B:42:0x007b, B:44:0x008b, B:46:0x00a0, B:50:0x00ae, B:52:0x00b2, B:54:0x00c2, B:56:0x00d7, B:59:0x00e3, B:69:0x0122, B:73:0x012f, B:75:0x013c, B:77:0x014a, B:78:0x0153, B:80:0x0161, B:82:0x0165, B:83:0x0168, B:62:0x00f4, B:64:0x0102, B:66:0x010a, B:67:0x0115, B:26:0x004d, B:32:0x005a), top: B:100:0x0009, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x012f A[Catch: all -> 0x0054, TRY_ENTER, TryCatch #2 {all -> 0x0054, blocks: (B:22:0x0046, B:37:0x0064, B:39:0x006d, B:40:0x0075, B:42:0x007b, B:44:0x008b, B:46:0x00a0, B:50:0x00ae, B:52:0x00b2, B:54:0x00c2, B:56:0x00d7, B:59:0x00e3, B:69:0x0122, B:73:0x012f, B:75:0x013c, B:77:0x014a, B:78:0x0153, B:80:0x0161, B:82:0x0165, B:83:0x0168, B:62:0x00f4, B:64:0x0102, B:66:0x010a, B:67:0x0115, B:26:0x004d, B:32:0x005a), top: B:97:0x0046, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x013c A[Catch: all -> 0x0054, TryCatch #2 {all -> 0x0054, blocks: (B:22:0x0046, B:37:0x0064, B:39:0x006d, B:40:0x0075, B:42:0x007b, B:44:0x008b, B:46:0x00a0, B:50:0x00ae, B:52:0x00b2, B:54:0x00c2, B:56:0x00d7, B:59:0x00e3, B:69:0x0122, B:73:0x012f, B:75:0x013c, B:77:0x014a, B:78:0x0153, B:80:0x0161, B:82:0x0165, B:83:0x0168, B:62:0x00f4, B:64:0x0102, B:66:0x010a, B:67:0x0115, B:26:0x004d, B:32:0x005a), top: B:97:0x0046, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x0161 A[Catch: all -> 0x0054, TryCatch #2 {all -> 0x0054, blocks: (B:22:0x0046, B:37:0x0064, B:39:0x006d, B:40:0x0075, B:42:0x007b, B:44:0x008b, B:46:0x00a0, B:50:0x00ae, B:52:0x00b2, B:54:0x00c2, B:56:0x00d7, B:59:0x00e3, B:69:0x0122, B:73:0x012f, B:75:0x013c, B:77:0x014a, B:78:0x0153, B:80:0x0161, B:82:0x0165, B:83:0x0168, B:62:0x00f4, B:64:0x0102, B:66:0x010a, B:67:0x0115, B:26:0x004d, B:32:0x005a), top: B:97:0x0046, outer: #4 }] */
    public final void a(Context context) {
        Context applicationContext;
        final SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2;
        C2449Ti c2449Ti;
        if (this.f28708c) {
            return;
        }
        synchronized (this.f28706a) {
            try {
                if (this.f28708c) {
                    return;
                }
                if (!this.f28709d) {
                    this.f28709d = true;
                }
                this.f28714i = TextUtils.equals(context.getPackageName(), "com.google.android.gms");
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                this.f28712g = context;
                try {
                    this.f28711f = Wrappers.packageManager(context).getApplicationInfo(this.f28712g.getPackageName(), IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT).metaData;
                } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
                }
                try {
                    Context context2 = this.f28712g;
                    SharedPreferences sharedPreferencesB = null;
                    if (context2 == null) {
                        context2 = null;
                    } else {
                        try {
                            applicationContext = context2.createPackageContext("com.google.android.gms", 0);
                        } catch (PackageManager.NameNotFoundException unused2) {
                            applicationContext = null;
                        }
                        if (applicationContext != null || (applicationContext = context2.getApplicationContext()) != null) {
                            context2 = applicationContext;
                        }
                    }
                    if (context2 != null) {
                        H4.B.a();
                        sharedPreferencesB = C3013bi.b(context2);
                    }
                    if (sharedPreferencesB != null) {
                        AbstractC1568Cj.c(new C3138ci(this, sharedPreferencesB));
                    }
                    if (!this.f28714i) {
                        C2449Ti c2449Ti2 = AbstractC3015bj.f26899d;
                        if (((Long) c2449Ti2.e()).longValue() > 0 && AbstractC2447Th.d(this.f28712g) >= ((Long) c2449Ti2.e()).longValue()) {
                            this.f28715j = true;
                            this.f28708c = true;
                            this.f28709d = false;
                            this.f28707b.open();
                        } else if (this.f28714i) {
                            Context context3 = this.f28712g;
                            if (!((Boolean) AbstractC4145kj.f30870k.e()).booleanValue()) {
                                if (((Boolean) AbstractC4145kj.f30871l.e()).booleanValue()) {
                                    if (new JSONObject((String) AbstractC4143ki.a(new InterfaceC4166kt0() { // from class: com.google.android.gms.internal.ads.ei
                                        @Override // com.google.android.gms.internal.ads.InterfaceC4166kt0
                                        public final /* synthetic */ Object zza() {
                                            return sharedPreferences.getString("app_settings_json", "{}");
                                        }
                                    })).optBoolean("local_flags_enabled")) {
                                    }
                                }
                                if (context2 == null) {
                                    H4.B.a();
                                    this.f28710e = C3013bi.b(context2);
                                    if (!this.f28714i) {
                                        H4.B.d().a(this.f28712g);
                                    }
                                    if (!((Boolean) AbstractC4145kj.f30862c.e()).booleanValue()) {
                                        sharedPreferences2.registerOnSharedPreferenceChangeListener(this);
                                    }
                                    g(this.f28710e);
                                    this.f28708c = true;
                                    this.f28709d = false;
                                    this.f28707b.open();
                                    return;
                                }
                                this.f28709d = false;
                                this.f28707b.open();
                            }
                            context2 = this.f28712g;
                            if (context2 == null) {
                                H4.B.a();
                                this.f28710e = C3013bi.b(context2);
                                if (!this.f28714i) {
                                    H4.B.d().a(this.f28712g);
                                }
                                if (!((Boolean) AbstractC4145kj.f30862c.e()).booleanValue()) {
                                    sharedPreferences2.registerOnSharedPreferenceChangeListener(this);
                                }
                                g(this.f28710e);
                                this.f28708c = true;
                                this.f28709d = false;
                                this.f28707b.open();
                                return;
                            }
                            this.f28709d = false;
                            this.f28707b.open();
                        } else {
                            c2449Ti = AbstractC3015bj.f26901f;
                            if (((Long) c2449Ti.e()).longValue() > 0 || AbstractC2447Th.c(this.f28712g) < ((Long) c2449Ti.e()).longValue()) {
                                Context context4 = this.f28712g;
                                if (!((Boolean) AbstractC4145kj.f30870k.e()).booleanValue()) {
                                    if (((Boolean) AbstractC4145kj.f30871l.e()).booleanValue() && (sharedPreferences = context4.getSharedPreferences(TenjinConsts.AD_NETWORK_ADMOB, 0)) != null) {
                                        try {
                                            if (new JSONObject((String) AbstractC4143ki.a(new InterfaceC4166kt0() { // from class: com.google.android.gms.internal.ads.ei
                                                @Override // com.google.android.gms.internal.ads.InterfaceC4166kt0
                                                public final /* synthetic */ Object zza() {
                                                    return sharedPreferences.getString("app_settings_json", "{}");
                                                }
                                            })).optBoolean("local_flags_enabled")) {
                                            }
                                        } catch (JSONException unused3) {
                                        }
                                    }
                                    if (context2 == null) {
                                        H4.B.a();
                                        this.f28710e = C3013bi.b(context2);
                                        if (!this.f28714i && ((Boolean) AbstractC4145kj.f30864e.e()).booleanValue()) {
                                            H4.B.d().a(this.f28712g);
                                        }
                                        if (!((Boolean) AbstractC4145kj.f30862c.e()).booleanValue() && (sharedPreferences2 = this.f28710e) != null) {
                                            sharedPreferences2.registerOnSharedPreferenceChangeListener(this);
                                        }
                                        g(this.f28710e);
                                        this.f28708c = true;
                                        this.f28709d = false;
                                        this.f28707b.open();
                                        return;
                                    }
                                    this.f28709d = false;
                                    this.f28707b.open();
                                }
                                context2 = this.f28712g;
                                if (context2 == null) {
                                    H4.B.a();
                                    this.f28710e = C3013bi.b(context2);
                                    if (!this.f28714i) {
                                        H4.B.d().a(this.f28712g);
                                    }
                                    if (!((Boolean) AbstractC4145kj.f30862c.e()).booleanValue()) {
                                        sharedPreferences2.registerOnSharedPreferenceChangeListener(this);
                                    }
                                    g(this.f28710e);
                                    this.f28708c = true;
                                    this.f28709d = false;
                                    this.f28707b.open();
                                    return;
                                }
                                this.f28709d = false;
                                this.f28707b.open();
                            } else {
                                this.f28715j = true;
                                this.f28708c = true;
                                this.f28709d = false;
                                this.f28707b.open();
                            }
                        }
                    } else if (this.f28714i) {
                        c2449Ti = AbstractC3015bj.f26901f;
                        if (((Long) c2449Ti.e()).longValue() > 0) {
                            Context context5 = this.f28712g;
                            if (!((Boolean) AbstractC4145kj.f30870k.e()).booleanValue()) {
                                if (((Boolean) AbstractC4145kj.f30871l.e()).booleanValue()) {
                                    if (new JSONObject((String) AbstractC4143ki.a(new InterfaceC4166kt0() { // from class: com.google.android.gms.internal.ads.ei
                                        @Override // com.google.android.gms.internal.ads.InterfaceC4166kt0
                                        public final /* synthetic */ Object zza() {
                                            return sharedPreferences.getString("app_settings_json", "{}");
                                        }
                                    })).optBoolean("local_flags_enabled")) {
                                    }
                                }
                                if (context2 == null) {
                                    H4.B.a();
                                    this.f28710e = C3013bi.b(context2);
                                    if (!this.f28714i) {
                                        H4.B.d().a(this.f28712g);
                                    }
                                    if (!((Boolean) AbstractC4145kj.f30862c.e()).booleanValue()) {
                                        sharedPreferences2.registerOnSharedPreferenceChangeListener(this);
                                    }
                                    g(this.f28710e);
                                    this.f28708c = true;
                                    this.f28709d = false;
                                    this.f28707b.open();
                                    return;
                                }
                                this.f28709d = false;
                                this.f28707b.open();
                            }
                            context2 = this.f28712g;
                            if (context2 == null) {
                                H4.B.a();
                                this.f28710e = C3013bi.b(context2);
                                if (!this.f28714i) {
                                    H4.B.d().a(this.f28712g);
                                }
                                if (!((Boolean) AbstractC4145kj.f30862c.e()).booleanValue()) {
                                    sharedPreferences2.registerOnSharedPreferenceChangeListener(this);
                                }
                                g(this.f28710e);
                                this.f28708c = true;
                                this.f28709d = false;
                                this.f28707b.open();
                                return;
                            }
                            this.f28709d = false;
                            this.f28707b.open();
                        } else {
                            Context context6 = this.f28712g;
                            if (!((Boolean) AbstractC4145kj.f30870k.e()).booleanValue()) {
                                if (((Boolean) AbstractC4145kj.f30871l.e()).booleanValue()) {
                                    if (new JSONObject((String) AbstractC4143ki.a(new InterfaceC4166kt0() { // from class: com.google.android.gms.internal.ads.ei
                                        @Override // com.google.android.gms.internal.ads.InterfaceC4166kt0
                                        public final /* synthetic */ Object zza() {
                                            return sharedPreferences.getString("app_settings_json", "{}");
                                        }
                                    })).optBoolean("local_flags_enabled")) {
                                    }
                                }
                                if (context2 == null) {
                                    H4.B.a();
                                    this.f28710e = C3013bi.b(context2);
                                    if (!this.f28714i) {
                                        H4.B.d().a(this.f28712g);
                                    }
                                    if (!((Boolean) AbstractC4145kj.f30862c.e()).booleanValue()) {
                                        sharedPreferences2.registerOnSharedPreferenceChangeListener(this);
                                    }
                                    g(this.f28710e);
                                    this.f28708c = true;
                                    this.f28709d = false;
                                    this.f28707b.open();
                                    return;
                                }
                                this.f28709d = false;
                                this.f28707b.open();
                            }
                            context2 = this.f28712g;
                            if (context2 == null) {
                                H4.B.a();
                                this.f28710e = C3013bi.b(context2);
                                if (!this.f28714i) {
                                    H4.B.d().a(this.f28712g);
                                }
                                if (!((Boolean) AbstractC4145kj.f30862c.e()).booleanValue()) {
                                    sharedPreferences2.registerOnSharedPreferenceChangeListener(this);
                                }
                                g(this.f28710e);
                                this.f28708c = true;
                                this.f28709d = false;
                                this.f28707b.open();
                                return;
                            }
                            this.f28709d = false;
                            this.f28707b.open();
                        }
                    } else {
                        Context context7 = this.f28712g;
                        if (!((Boolean) AbstractC4145kj.f30870k.e()).booleanValue()) {
                            if (((Boolean) AbstractC4145kj.f30871l.e()).booleanValue()) {
                                if (new JSONObject((String) AbstractC4143ki.a(new InterfaceC4166kt0() { // from class: com.google.android.gms.internal.ads.ei
                                    @Override // com.google.android.gms.internal.ads.InterfaceC4166kt0
                                    public final /* synthetic */ Object zza() {
                                        return sharedPreferences.getString("app_settings_json", "{}");
                                    }
                                })).optBoolean("local_flags_enabled")) {
                                }
                            }
                            if (context2 == null) {
                                H4.B.a();
                                this.f28710e = C3013bi.b(context2);
                                if (!this.f28714i) {
                                    H4.B.d().a(this.f28712g);
                                }
                                if (!((Boolean) AbstractC4145kj.f30862c.e()).booleanValue()) {
                                    sharedPreferences2.registerOnSharedPreferenceChangeListener(this);
                                }
                                g(this.f28710e);
                                this.f28708c = true;
                                this.f28709d = false;
                                this.f28707b.open();
                                return;
                            }
                            this.f28709d = false;
                            this.f28707b.open();
                        }
                        context2 = this.f28712g;
                        if (context2 == null) {
                            H4.B.a();
                            this.f28710e = C3013bi.b(context2);
                            if (!this.f28714i) {
                                H4.B.d().a(this.f28712g);
                            }
                            if (!((Boolean) AbstractC4145kj.f30862c.e()).booleanValue()) {
                                sharedPreferences2.registerOnSharedPreferenceChangeListener(this);
                            }
                            g(this.f28710e);
                            this.f28708c = true;
                            this.f28709d = false;
                            this.f28707b.open();
                            return;
                        }
                        this.f28709d = false;
                        this.f28707b.open();
                    }
                } catch (Throwable th) {
                    this.f28709d = false;
                    this.f28707b.open();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    final boolean b() {
        return this.f28714i;
    }

    public final boolean c() {
        return this.f28715j;
    }

    public final Object d(final AbstractC2759Zh abstractC2759Zh) {
        if (!this.f28707b.block(ServiceProvider.SCAR_VERSION_FETCH_TIMEOUT)) {
            synchronized (this.f28706a) {
                try {
                    if (!this.f28709d) {
                        throw new IllegalStateException("Flags.initialize() was not called!");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (!this.f28708c || this.f28710e == null || this.f28715j) {
            synchronized (this.f28706a) {
                if (this.f28708c && this.f28710e != null && !this.f28715j) {
                }
                return abstractC2759Zh.f();
            }
        }
        if (abstractC2759Zh.m() != 2) {
            return (abstractC2759Zh.m() == 1 && this.f28713h.has(abstractC2759Zh.e())) ? abstractC2759Zh.c(this.f28713h) : AbstractC4143ki.a(new InterfaceC4166kt0() { // from class: com.google.android.gms.internal.ads.fi
                @Override // com.google.android.gms.internal.ads.InterfaceC4166kt0
                public final /* synthetic */ Object zza() {
                    return this.f28459a.f(abstractC2759Zh);
                }
            });
        }
        Bundle bundle = this.f28711f;
        return bundle == null ? abstractC2759Zh.f() : abstractC2759Zh.a(bundle);
    }

    public final Object e(AbstractC2759Zh abstractC2759Zh) {
        return (this.f28708c || this.f28709d) ? d(abstractC2759Zh) : abstractC2759Zh.f();
    }

    final /* synthetic */ Object f(AbstractC2759Zh abstractC2759Zh) {
        return abstractC2759Zh.d(this.f28710e);
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            g(sharedPreferences);
        }
    }
}
