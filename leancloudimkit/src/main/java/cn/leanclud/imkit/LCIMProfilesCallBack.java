package cn.leanclud.imkit;


import java.util.List;

/**
 * Created by wli on 16/2/2.
 */
public interface LCIMProfilesCallBack {
  public void done(List<LCIMUserProfile> userList, Exception e);
}
