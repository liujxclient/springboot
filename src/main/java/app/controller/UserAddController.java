package app.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserAddController extends MyController {
	@RequestMapping("/userAdd")
	@ResponseBody
	public Map execute() {
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("returnCode", "000000");
		result.put("returnMsg", "操作成功");
		return result;
	}

}
