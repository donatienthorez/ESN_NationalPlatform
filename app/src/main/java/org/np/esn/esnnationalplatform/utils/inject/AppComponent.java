package org.np.esn.esnnationalplatform.utils.inject;

import org.np.esn.esnnationalplatform.ESNApplication;
import org.np.esn.esnnationalplatform.OCMembersAdapter;
import org.np.esn.esnnationalplatform.activities.MainActivity;
import org.np.esn.esnnationalplatform.adapters.TipsAdapter;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(
        modules = {
                AndroidModules.class
        }
)

public interface AppComponent {
        void inject(ESNApplication application);

        void inject(MainActivity mainActivity);

        void inject(OCMembersAdapter ocMembersAdapter);

        void inject(TipsAdapter tipsAdapter);
}
