package p120m;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import com.unity3d.services.UnityAdsConstants;
import p060g.i;

/* JADX INFO: loaded from: classes.dex */
public class d extends ContextWrapper {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static Configuration f46269f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f46270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Resources.Theme f46271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LayoutInflater f46272c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Configuration f46273d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Resources f46274e;

    public d(Context context, int i10) {
        super(context);
        this.f46270a = i10;
    }

    private Resources b() {
        if (this.f46274e == null) {
            Configuration configuration = this.f46273d;
            if (configuration == null || (Build.VERSION.SDK_INT >= 26 && e(configuration))) {
                this.f46274e = super.getResources();
            } else {
                this.f46274e = createConfigurationContext(this.f46273d).getResources();
            }
        }
        return this.f46274e;
    }

    private void d() {
        boolean z9 = this.f46271b == null;
        if (z9) {
            this.f46271b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f46271b.setTo(theme);
            }
        }
        f(this.f46271b, this.f46270a, z9);
    }

    private static boolean e(Configuration configuration) {
        if (configuration == null) {
            return true;
        }
        if (f46269f == null) {
            Configuration configuration2 = new Configuration();
            configuration2.fontScale = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            f46269f = configuration2;
        }
        return configuration.equals(f46269f);
    }

    public void a(Configuration configuration) {
        if (this.f46274e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f46273d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f46273d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public int c() {
        return this.f46270a;
    }

    protected void f(Resources.Theme theme, int i10, boolean z9) {
        theme.applyStyle(i10, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return b();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f46272c == null) {
            this.f46272c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f46272c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f46271b;
        if (theme != null) {
            return theme;
        }
        if (this.f46270a == 0) {
            this.f46270a = i.f44027d;
        }
        d();
        return this.f46271b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        if (this.f46270a != i10) {
            this.f46270a = i10;
            d();
        }
    }

    public d(Context context, Resources.Theme theme) {
        super(context);
        this.f46271b = theme;
    }
}
