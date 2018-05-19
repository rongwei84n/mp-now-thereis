let serverPath = 'http://test'

/**
 * post请求方法
 * @export
 * @param {String} url 请求接口名称
 * @param {Object} body 请求参数
 * @returns 一个Promise对象
 */
export function post(url, body) {
  return new Promise((resolve, reject) => {
    wx.request({
      url: serverPath + url, // 拼接完整的url
      data: body,
      method: 'POST',
      header: {
        'content-type': 'application/json'
      },
      success(res) {
        resolve(res.data) // 把返回的数据传出去
      },
      fail(ret) {
        reject(ret) // 把错误信息传出去
      }
    })
  })
}
